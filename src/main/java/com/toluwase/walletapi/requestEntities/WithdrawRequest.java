package com.toluwase.walletapi.requestEntities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class WithdrawRequest {
    private String pin;
    private Double withDrawAmount;
}
