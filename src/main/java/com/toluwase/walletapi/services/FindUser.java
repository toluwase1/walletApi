package com.toluwase.walletapi.services;

import com.toluwase.walletapi.models.User;
import com.toluwase.walletapi.models.UserInfo;

public interface FindUser {
    User getUserByEmail (String email);
    User getUserByAccountNumber (String accountNumber);
}
