package com.oesteCosmetica.oesteCos.config;

import com.oesteCosmetica.oesteCos.services.models.validations.UserValidation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ValidationsConfig {

    @Bean
    public UserValidation userValidation(){
        return new UserValidation();
    }
}
