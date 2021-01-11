package com.huang.dp.dao;

import com.huang.dp.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao {

    @Select("select * from user;")
    List<User> selectAll();

    /**
     *
     * @param username username
     * @param password password
     * @return res
     */
    @Insert("insert into user (username, password) values (${username}, ${password});")
    int insert(@Param("username") String username, @Param("password") String password);
}
