package com.config;

import org.springframework.web.servlet.HandlerInterceptor;
import com.config.UserPasswordUtil;
import com.entity.*;

public class TestInterceptor implements HandlerInterceptor {
    UserPasswordUtil en = new UserPasswordUtil();

}
