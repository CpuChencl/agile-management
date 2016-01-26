package com.deppon.mbi.agile.core.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sunyamorn on 1/27/16.
 * <p/>
 * Redirect request if users were verified successfully.
 */
@Component("loginSuccessHandler")
public class LoginSuccessHandler implements AuthenticationSuccessHandler {

    @Value("${application.main.page}")
    private String mainPage;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + mainPage);
    }
}