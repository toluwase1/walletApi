package com.toluwase.walletapi.requestEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DepositRequest {
    private String email;
    private String depositAmount;
    private String accountNumber;
    private String pin;
}
