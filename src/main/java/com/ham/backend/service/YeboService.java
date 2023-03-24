package com.ham.backend.service;

import com.ham.backend.vo.YeboVO;

import java.util.List;

public interface YeboService {
    public List<YeboVO> getYeboList(YeboVO vo) throws Exception;
}
