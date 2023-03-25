package com.ham.backend.service;

import com.ham.backend.vo.YeboVO;

import java.util.HashMap;
import java.util.List;

public interface YeboService {
    public List<HashMap<YeboVO,YeboVO>> getYeboList(YeboVO vo) throws Exception;
    public List<YeboVO> getAsk() throws Exception;
}
