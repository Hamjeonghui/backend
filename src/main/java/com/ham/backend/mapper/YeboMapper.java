package com.ham.backend.mapper;

import com.ham.backend.vo.YeboVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YeboMapper {

    public List<YeboVO> getYeboList (YeboVO vo) throws Exception;

}
