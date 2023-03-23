package com.ham.backend.service.impl;

import com.ham.backend.mapper.YeboMapper;
import com.ham.backend.service.YeboService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("yeboService")
public class YeboServiceImpl implements YeboService {

    @Resource
    private YeboMapper yeboMapper;

}
