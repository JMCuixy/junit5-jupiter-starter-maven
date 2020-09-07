package com.example.project.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {

    int deleteById(Long id);
}
