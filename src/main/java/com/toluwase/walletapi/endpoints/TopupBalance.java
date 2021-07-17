package com.toluwase.walletapi.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fund")
public class TopupBalance {

    @PostMapping("/topup")
    public  void fundAccountByTopup () {

    }
}
