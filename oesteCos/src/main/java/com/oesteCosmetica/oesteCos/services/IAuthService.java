package com.oesteCosmetica.oesteCos.services;

import com.oesteCosmetica.oesteCos.presistence.entitines.UserEntity;
import com.oesteCosmetica.oesteCos.services.models.dtos.LoginDTO;
import com.oesteCosmetica.oesteCos.services.models.dtos.ResponseDTO;

import java.util.HashMap;

public interface IAuthService {

    public HashMap<String,String> login(LoginDTO login) throws Exception;
    public ResponseDTO register(UserEntity user) throws Exception;
}
