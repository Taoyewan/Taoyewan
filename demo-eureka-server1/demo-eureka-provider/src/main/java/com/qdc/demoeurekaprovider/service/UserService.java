package com.qdc.demoeurekaprovider.service;

import com.qdc.demoeurekaprovider.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public User selectUserById(String id) {
        return new User("aaa", "123", "zip");
    }

    public List<User> selectAllUsers() {
        List<User> users = new ArrayList<>();
        User u1 = new User("test0001", "1234", "aaaa");
        User u2 = new User("test0002", "1234", "bbbb");
        users.add(u1);
        users.add(u2);
        return users;

    }

    public boolean addUser(User u) {
        return true;
    }

    public boolean updateUser(User u) {
        return true;
    }

    public boolean deleteUser(String name) {
        return true;
    }
}
