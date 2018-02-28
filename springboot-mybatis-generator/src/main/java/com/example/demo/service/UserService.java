package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

/**
 * Created by itdgyt01 on 2018/2/26.
 */
public interface UserService {
  int addUser(User user);

  List<User> findAllUser(int pageNum, int pageSize);

}
