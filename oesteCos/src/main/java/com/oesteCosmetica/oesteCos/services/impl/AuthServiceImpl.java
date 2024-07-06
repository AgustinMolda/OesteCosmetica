package com.oesteCosmetica.oesteCos.services.impl;

import com.oesteCosmetica.oesteCos.presistence.entitines.UserEntity;
import com.oesteCosmetica.oesteCos.presistence.repositories.UserRepository;
import com.oesteCosmetica.oesteCos.services.IAuthService;
import com.oesteCosmetica.oesteCos.services.IJwtUtilitiesService;
import com.oesteCosmetica.oesteCos.services.models.dtos.LoginDTO;
import com.oesteCosmetica.oesteCos.services.models.validations.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Optional;

public class AuthServiceImpl implements IAuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IJwtUtilitiesService jwtUtilitiesService;

    @Autowired
    private UserValidation userValidation;

    @Override
    public HashMap<String,String> login(LoginDTO login) throws Exception {

        try {
            HashMap<String,String> jwt = new HashMap<>();
            Optional<UserEntity> user = userRepository.findByUsername(login.getUserName());

            if(user.isEmpty()){
                jwt.put("error", "User not registered!");
                return jwt;
            }

            if(verifyPassword(login.getPassword(),user.get().getPassword())){
                jwt.put("jwt", jwtUtilitiesService.generateJWT(user.get().getId()));
            }else{
                jwt.put("error", "Authentication failed");
            }
            return jwt;

        }catch (Exception e){
            throw new Exception(e.toString());

        }
    }

    private boolean verifyPassword(String eneterdPassword, String storedPassword){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        return encoder.matches(eneterdPassword,storedPassword);
    }
}
