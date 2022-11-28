package com.example.pp_3_1_2_boot.dao;

import com.example.pp_3_1_2_boot.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();

    void saveUser(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);

}
