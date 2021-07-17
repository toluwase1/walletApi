package com.toluwase.walletapi.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class Authentication {
        @GetMapping("/signup")
        public void signup () {

            return ;
        }

        @GetMapping("/login")
        public boolean login () {

            return false;
        }

}
