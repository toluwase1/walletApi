package com.toluwase.walletapi.requestEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TopupRequest {
    private String email;
    private String accountNumber;
    private Double topupAmount;
    private String pin;
}

