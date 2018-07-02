package com.example.firstJSF.pojo;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * 简单测试用户类.
 *
 * @author <a href="mailto:chenhao2010h@163.com">chenhao</a>
 * @version 1.0.0
 * @since 1.0.0
 *
 * Created at 2018/6/28
 */
@Named
@Data
@Entity
@Table
public class User {
  @Id
  @GeneratedValue
  private String id;

  private String name;

  private String address;

  private Integer age;

  private String work;




}
