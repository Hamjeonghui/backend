package com.ham.backend.service.impl;

import com.ham.backend.mapper.ApiMapper;
import com.ham.backend.service.ApiService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("apiService")
public class ApiServiceImpl implements ApiService {

    @Resource
    private ApiMapper apiMapper;

    @Override
    public String getList() throws Exception {

        String testList=apiMapper.getList();
        System.out.println(testList);

        return testList;
    }
}
