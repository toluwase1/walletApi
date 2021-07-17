package com.toluwase.walletapi.services;

import com.toluwase.walletapi.models.LevelOneInfo;
import com.toluwase.walletapi.models.User;

public interface AuthService {
    User login (String email, String password);
    User signup (LevelOneInfo levelOne);


}
