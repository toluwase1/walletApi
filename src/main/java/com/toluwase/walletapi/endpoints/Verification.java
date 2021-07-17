package com.toluwase.walletapi.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/verify")
public class Verification {
    @GetMapping("/email")
    public boolean verifyEmail () {

        return false;
    }

    @GetMapping("/bvn")
    public boolean verifyBVN () {

        return false;
    }


}
