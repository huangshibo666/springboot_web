package com.huang.dp.service;

import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserService {

    List<String> getAllUsername();

    int insertUser(String username, String password);

}
