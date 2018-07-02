package com.example.firstJSF.pojo;

import com.example.firstJSF.service.UserService;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * TODO
 *
 * @author <a href="mailto:chenhao2010h@163.com">chenhao</a>
 * @version 1.0.0
 * @since 1.0.0
 *
 * Created at 2018/6/28
 */
@Named
public class HelloWorld {

  @Inject
  private UserService userService;

  @Inject
  private User user;

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void save() {
    userService.save(user);
  }
}

