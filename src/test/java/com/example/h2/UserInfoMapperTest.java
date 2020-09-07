package com.example.h2;

import com.example.project.mapper.UserInfoMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserInfoMapperTest {

    private UserInfoMapper userInfoMapper;

    @Test
    @DisplayName("deleteById")
    public void deleteById() {
        int rows = userInfoMapper.deleteById(1L);
        assertEquals(1, rows, "删除失败");
    }
}