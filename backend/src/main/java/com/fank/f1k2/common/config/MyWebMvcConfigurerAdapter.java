package com.fank.f1k2.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurerAdapter implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/imagesWeb/**").addResourceLocations("file:G:/Project/20251026基于Rome解析的RSS链接订阅平台/db/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
