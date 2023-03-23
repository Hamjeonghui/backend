package com.ham.backend.controller;

import com.ham.backend.service.ApiService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Resource(name = "apiService")
    private ApiService apiService;

    @GetMapping("/api")
    public String test() throws Exception {
        String testList=apiService.getList();
        return testList;
    }
}
