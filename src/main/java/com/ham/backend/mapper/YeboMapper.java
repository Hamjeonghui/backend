package com.ham.backend.mapper;

import com.ham.backend.vo.YeboVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface YeboMapper {

    public List<HashMap<YeboVO,YeboVO>> getYeboList (YeboVO vo) throws Exception;

    public List<YeboVO> getAsk() throws Exception;

}
