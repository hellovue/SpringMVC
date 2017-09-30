//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.UserKey;

/**
 * UserEntity [ sampledb.t_user ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class UserEntity extends UserKey implements Serializable {
  /** user_name [ t_user.user_name ]. */
  private String userName;

  /** credits [ t_user.credits ]. */
  private Integer credits;

  /** password [ t_user.password ]. */
  private String password;

  /** last_visit [ t_user.last_visit ]. */
  private Date lastVisit;

  /** last_ip [ t_user.last_ip ]. */
  private String lastIp;

  /**
   * GET user_name [ t_user.user_name ].
   *
   * @return java.lang.String
   */
  public String getUserName() {
    return userName;
  }

  /**
   * WITH user_name [ t_user.user_name ].
   *
   * @param userName java.lang.String
   * @return org.github.spring.base.entity.UserEntity
   */
  public UserEntity withUserName(String userName) {
    this.setUserName(userName);
    return this;
  }

  /**
   * SET user_name [ t_user.user_name ].
   *
   * @param userName java.lang.String
   */
  public void setUserName(String userName) {
    this.userName = userName == null ? null : userName.trim();
  }

  /**
   * GET credits [ t_user.credits ].
   *
   * @return java.lang.Integer
   */
  public Integer getCredits() {
    return credits;
  }

  /**
   * WITH credits [ t_user.credits ].
   *
   * @param credits java.lang.Integer
   * @return org.github.spring.base.entity.UserEntity
   */
  public UserEntity withCredits(Integer credits) {
    this.setCredits(credits);
    return this;
  }

  /**
   * SET credits [ t_user.credits ].
   *
   * @param credits java.lang.Integer
   */
  public void setCredits(Integer credits) {
    this.credits = credits;
  }

  /**
   * GET password [ t_user.password ].
   *
   * @return java.lang.String
   */
  public String getPassword() {
    return password;
  }

  /**
   * WITH password [ t_user.password ].
   *
   * @param password java.lang.String
   * @return org.github.spring.base.entity.UserEntity
   */
  public UserEntity withPassword(String password) {
    this.setPassword(password);
    return this;
  }

  /**
   * SET password [ t_user.password ].
   *
   * @param password java.lang.String
   */
  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  /**
   * GET last_visit [ t_user.last_visit ].
   *
   * @return java.util.Date
   */
  public Date getLastVisit() {
    return lastVisit;
  }

  /**
   * WITH last_visit [ t_user.last_visit ].
   *
   * @param lastVisit java.util.Date
   * @return org.github.spring.base.entity.UserEntity
   */
  public UserEntity withLastVisit(Date lastVisit) {
    this.setLastVisit(lastVisit);
    return this;
  }

  /**
   * SET last_visit [ t_user.last_visit ].
   *
   * @param lastVisit java.util.Date
   */
  public void setLastVisit(Date lastVisit) {
    this.lastVisit = lastVisit;
  }

  /**
   * GET last_ip [ t_user.last_ip ].
   *
   * @return java.lang.String
   */
  public String getLastIp() {
    return lastIp;
  }

  /**
   * WITH last_ip [ t_user.last_ip ].
   *
   * @param lastIp java.lang.String
   * @return org.github.spring.base.entity.UserEntity
   */
  public UserEntity withLastIp(String lastIp) {
    this.setLastIp(lastIp);
    return this;
  }

  /**
   * SET last_ip [ t_user.last_ip ].
   *
   * @param lastIp java.lang.String
   */
  public void setLastIp(String lastIp) {
    this.lastIp = lastIp == null ? null : lastIp.trim();
  }
}