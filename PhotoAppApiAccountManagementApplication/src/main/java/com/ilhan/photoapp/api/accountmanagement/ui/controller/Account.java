package com.ilhan.photoapp.api.accountmanagement.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class Account {
    @GetMapping("/status/check")
    public String status() {
        return "working";
    }
}
