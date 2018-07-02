package com.example.firstJSF.service.impl;

import com.example.firstJSF.dao.UserRepository;
import com.example.firstJSF.pojo.User;
import com.example.firstJSF.service.UserService;
import javax.inject.Inject;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author <a href="mailto:chenhao2010h@163.com">chenhao</a>
 * @version 1.0.0
 * @since 1.0.0
 *
 * Created at 2018/6/28
 */
@Service
public class UserServiceImpl implements UserService {

  @Inject
  private UserRepository userRepository;


  @Override
  public void save(User user) {
    userRepository.save(user);
  }
}
