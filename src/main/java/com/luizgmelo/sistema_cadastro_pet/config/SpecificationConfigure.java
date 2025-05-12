package com.luizgmelo.sistema_cadastro_pet.config;

import net.kaczmarzyk.spring.data.jpa.web.SpecificationArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
public class SpecificationConfigure extends WebMvcConfigurationSupport {
    @Override
    protected void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new SpecificationArgumentResolver());
        super.addArgumentResolvers(argumentResolvers);
    }
}
