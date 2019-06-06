package com.wzy.mallcat.backend.rest;

import org.jasig.cas.client.util.AbstractCasFilter;
import org.jasig.cas.client.util.AssertionHolder;
import org.jasig.cas.client.validation.Assertion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String  login(HttpServletRequest request){

        Assertion assertion = (Assertion) request.getSession().getAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);
        String loginName = assertion.getPrincipal().getName();
        return loginName;
    }

    @RequestMapping("testAssertionThreadLocalFilter")
    public String testAssertionThreadLocalFilter(){

        String loginName = AssertionHolder.getAssertion().getPrincipal().getName();
        return loginName;
    }

    @Value("${cas.server-url-prefix}")
    private String casServerUrlPrefix;

    @Value("${cas.client-host-url}")
    private String casClientHostUrl;

    @RequestMapping("loginOut")
    public String loginOut(HttpServletRequest request){

        String contectPath = request.getContextPath();
        HttpSession session = request.getSession();
        session.invalidate();
//        session.removeAttribute(AbstractCasFilter.CONST_CAS_ASSERTION);

        return "redirect:" + casServerUrlPrefix + "/logout?service="+ casClientHostUrl + "/" + contectPath +"/login";
    }
}
