package com.ham.backend.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApiMapper {

    public String getList() throws Exception;

}
