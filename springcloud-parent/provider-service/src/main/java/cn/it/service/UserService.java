package cn.it.service;

import cn.it.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findById(Integer id);

}
