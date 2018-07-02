package com.example.firstJSF.dao;

import com.example.firstJSF.pojo.User;
import javax.ejb.Stateless;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TODO
 *
 * @author <a href="mailto:chenhao2010h@163.com">chenhao</a>
 * @version 1.0.0
 * @since 1.0.0
 *
 * Created at 2018/6/28
 */
public interface UserRepository extends JpaRepository<User,String> {

}
