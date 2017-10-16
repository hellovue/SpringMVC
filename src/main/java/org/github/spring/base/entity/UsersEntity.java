//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.UsersKey;

/**
 * UsersEntity [ sampledb.t_users ].
 *
 * @author MyBatisGenerator
 * @version 2017-10-14
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class UsersEntity extends UsersKey implements Serializable {
  /** 用户名 [ t_users.username ]. */
  private String username;

  /** 用户密码 [ t_users.password ]. */
  private String password;

  /** 密保问题 [ t_users.question ]. */
  private String question;

  /** 密保答案 [ t_users.answer ]. */
  private String answer;

  /** 用户图片 [ t_users.user_img ]. */
  private String userImg;

  /** 注册时间 [ t_users.regtime ]. */
  private Date regtime;

  /**
   * GET 用户名 [ t_users.username ].
   *
   * @return java.lang.String
   */
  public String getUsername() {
    return username;
  }

  /**
   * WITH 用户名 [ t_users.username ].
   *
   * @param username java.lang.String
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withUsername(String username) {
    this.setUsername(username);
    return this;
  }

  /**
   * SET 用户名 [ t_users.username ].
   *
   * @param username java.lang.String
   */
  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  /**
   * GET 用户密码 [ t_users.password ].
   *
   * @return java.lang.String
   */
  public String getPassword() {
    return password;
  }

  /**
   * WITH 用户密码 [ t_users.password ].
   *
   * @param password java.lang.String
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withPassword(String password) {
    this.setPassword(password);
    return this;
  }

  /**
   * SET 用户密码 [ t_users.password ].
   *
   * @param password java.lang.String
   */
  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  /**
   * GET 密保问题 [ t_users.question ].
   *
   * @return java.lang.String
   */
  public String getQuestion() {
    return question;
  }

  /**
   * WITH 密保问题 [ t_users.question ].
   *
   * @param question java.lang.String
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withQuestion(String question) {
    this.setQuestion(question);
    return this;
  }

  /**
   * SET 密保问题 [ t_users.question ].
   *
   * @param question java.lang.String
   */
  public void setQuestion(String question) {
    this.question = question == null ? null : question.trim();
  }

  /**
   * GET 密保答案 [ t_users.answer ].
   *
   * @return java.lang.String
   */
  public String getAnswer() {
    return answer;
  }

  /**
   * WITH 密保答案 [ t_users.answer ].
   *
   * @param answer java.lang.String
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withAnswer(String answer) {
    this.setAnswer(answer);
    return this;
  }

  /**
   * SET 密保答案 [ t_users.answer ].
   *
   * @param answer java.lang.String
   */
  public void setAnswer(String answer) {
    this.answer = answer == null ? null : answer.trim();
  }

  /**
   * GET 用户图片 [ t_users.user_img ].
   *
   * @return java.lang.String
   */
  public String getUserImg() {
    return userImg;
  }

  /**
   * WITH 用户图片 [ t_users.user_img ].
   *
   * @param userImg java.lang.String
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withUserImg(String userImg) {
    this.setUserImg(userImg);
    return this;
  }

  /**
   * SET 用户图片 [ t_users.user_img ].
   *
   * @param userImg java.lang.String
   */
  public void setUserImg(String userImg) {
    this.userImg = userImg == null ? null : userImg.trim();
  }

  /**
   * GET 注册时间 [ t_users.regtime ].
   *
   * @return java.util.Date
   */
  public Date getRegtime() {
    return regtime;
  }

  /**
   * WITH 注册时间 [ t_users.regtime ].
   *
   * @param regtime java.util.Date
   * @return org.github.spring.base.entity.UsersEntity
   */
  public UsersEntity withRegtime(Date regtime) {
    this.setRegtime(regtime);
    return this;
  }

  /**
   * SET 注册时间 [ t_users.regtime ].
   *
   * @param regtime java.util.Date
   */
  public void setRegtime(Date regtime) {
    this.regtime = regtime;
  }
}