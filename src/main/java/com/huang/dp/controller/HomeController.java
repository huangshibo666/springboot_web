package com.huang.dp.controller;

import com.huang.dp.dao.UserDao;
import com.huang.dp.service.IUserService;
import com.huang.dp.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/")
    public Object index() {
        return "index";
    }

    @RequestMapping("/user/show")
    public Object showUsers(HttpServletRequest request) {
        List<String> usernameList = userService.getAllUsername();
        request.setAttribute("usernameList", usernameList);
        return "index";
    }

    @ResponseBody
    @RequestMapping("/user/insert")
    public Object insertUser(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username != null && password != null) {
            int flag = userService.insertUser(username, password);
            if (flag > 0) {
                return "写入成功";
            } else {
                return "写入失败";
            }
        } else {
            return "输入参数错误";
        }
    }


}
