package com.example.dao.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.dao.entity.User;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<User> {

}
