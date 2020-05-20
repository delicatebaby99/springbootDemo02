package com.tedu.springbootdemo02.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * date:2020-05-16
 * author:zhangxiaoshuai
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    //          设置启动页面
private static final Logger log= LoggerFactory.getLogger(MvcConfig.class);
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/admin/admin_modi.html").setViewName("admin/admin_modi");
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        log.debug("自定义的资源映射");
//        registry.addResourceHandler("/templates/**").addResourceLocations();
//
//    }

//      添加拦截器


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/*.html","admin")
                .excludePathPatterns("/","/login.html","account/doLogin");
    }
}
