package com.huang.dp.service.impl;

import com.huang.dp.dao.UserDao;
import com.huang.dp.model.User;
import com.huang.dp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<String> getAllUsername() {
        List<User> users = userDao.selectAll();
        return users.stream().map(User::getUsername).collect(Collectors.toList());
    }

    @Override
    public int insertUser(String username, String password) {
        return userDao.insert(username, password);
    }
}
