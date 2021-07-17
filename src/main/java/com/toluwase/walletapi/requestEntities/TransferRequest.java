package com.toluwase.walletapi.requestEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TransferRequest {
    private String destinationAccount;
    private Double transferAmount;
    private String pin;
    private String email;

}
