package com.ham.backend.service.impl;

import com.ham.backend.mapper.YeboMapper;
import com.ham.backend.service.YeboService;
import com.ham.backend.vo.YeboVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("yeboService")
public class YeboServiceImpl implements YeboService {

    @Resource
    private YeboMapper yeboMapper;

    @Override
    public List<YeboVO> getYeboList(YeboVO vo) throws Exception {
        List<YeboVO> yeboList= new ArrayList<YeboVO>();
        yeboList= yeboMapper.getYeboList(vo);
        return yeboList;
    }
}
