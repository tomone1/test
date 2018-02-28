package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tom
 * @Date 2018/2/26 16:31
 */
@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;//这里会报错，但是并不会影响

  @Override
  public int addUser(User user) {
    return userMapper.insertSelective(user);

  }

  @Override
  public List<User> findAllUser(int pageNum, int pageSize) {
    //将参数传给这个方法就可以实现物理分页了，非常简单。
    PageHelper.startPage(pageNum, pageSize);
    return userMapper.selectAllUser();

  }
}
