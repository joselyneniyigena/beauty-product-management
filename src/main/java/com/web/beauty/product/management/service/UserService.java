package com.web.beauty.product.management.service;

import com.web.beauty.product.management.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User findByUsername(String username);
}
