package com.example.pp_3_1_2_boot.service;


import com.example.pp_3_1_2_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void saveUser(User user);

    User getById(int id);

    void update(User user);

    void delete(int id);
}
