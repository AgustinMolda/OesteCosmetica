package com.oesteCosmetica.oesteCos.services.impl;

import com.oesteCosmetica.oesteCos.presistence.entitines.UserEntity;
import com.oesteCosmetica.oesteCos.presistence.repositories.UserRepository;
import com.oesteCosmetica.oesteCos.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UserEntity> findAllUsers() {
        return userRepository.findAll();
    }
}
