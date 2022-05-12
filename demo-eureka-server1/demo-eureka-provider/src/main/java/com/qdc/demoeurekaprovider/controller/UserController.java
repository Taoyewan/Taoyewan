package com.qdc.demoeurekaprovider.controller;

import com.qdc.demoeurekaprovider.pojo.User;
import com.qdc.demoeurekaprovider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    //adduser方法接受前端传过来的数据也是json格式把json格式转换为user对象
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = " /update", method = RequestMethod.PUT)
    public boolean updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/del", method = RequestMethod.DELETE)
    public boolean delUser(String name) {
        return userService.deleteUser(name);
    }

    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public User selectUserById(@RequestParam(value = "userid", required = true) String id) {
        return userService.selectUserById(id);
    }

    @RequestMapping(value = "/userall", method = RequestMethod.GET)
    public List<User> selectAll() {
        return userService.selectAllUsers();
    }
}
