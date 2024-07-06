package com.oesteCosmetica.oesteCos.services;

import com.oesteCosmetica.oesteCos.presistence.entitines.UserEntity;

import java.util.List;

public interface IUserService {
    public List<UserEntity> findAllUsers();
}
