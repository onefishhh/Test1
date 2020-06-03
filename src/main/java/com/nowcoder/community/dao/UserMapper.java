package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    Integer insertUser(User user);

    Integer updateStatus(int id, int status);

    Integer updateHeader(int id, String headerUrl);

    Integer updatePassword(int id, String password);






}
