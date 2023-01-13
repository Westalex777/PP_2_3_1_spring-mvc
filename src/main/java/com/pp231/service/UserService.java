package com.pp231.service;

import com.pp231.model.User;

import java.util.List;

public interface UserService {
    public void saveUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(int id);
    public void updateUser(User user);
    public User getUser(int id);

}
