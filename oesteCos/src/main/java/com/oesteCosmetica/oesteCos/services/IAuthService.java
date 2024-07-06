package com.oesteCosmetica.oesteCos.services;

import com.oesteCosmetica.oesteCos.services.models.dtos.LoginDTO;

import java.util.HashMap;

public interface IAuthService {

    public HashMap<String,String> login(LoginDTO login) throws Exception;
}
