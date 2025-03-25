package com.example.service;

import com.example.dao.UserDAO;
import com.example.model.User;

public class UserService {

    private UserDAO userDAO = new UserDAO();

    public void registerUser(User user) {
        userDAO.saveUser(user);
    }

    public User loginUser(String email, String password) {
        User user = userDAO.findUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
