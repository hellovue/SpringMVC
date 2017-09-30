//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.ResponseSecKey;

/**
 * ResponseSecEntity [ sampledb.t_response_sec ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class ResponseSecEntity extends ResponseSecKey implements Serializable {
  /** 用户ID（外键） [ t_response_sec.user_id ]. */
  private String userId;

  /** 回复消息 [ t_response_sec.text ]. */
  private String text;

  /** 创建时间 [ t_response_sec.create_time ]. */
  private Date createTime;

  /**
   * GET 用户ID（外键） [ t_response_sec.user_id ].
   *
   * @return java.lang.String
   */
  public String getUserId() {
    return userId;
  }

  /**
   * WITH 用户ID（外键） [ t_response_sec.user_id ].
   *
   * @param userId java.lang.String
   * @return org.github.spring.base.entity.ResponseSecEntity
   */
  public ResponseSecEntity withUserId(String userId) {
    this.setUserId(userId);
    return this;
  }

  /**
   * SET 用户ID（外键） [ t_response_sec.user_id ].
   *
   * @param userId java.lang.String
   */
  public void setUserId(String userId) {
    this.userId = userId == null ? null : userId.trim();
  }

  /**
   * GET 回复消息 [ t_response_sec.text ].
   *
   * @return java.lang.String
   */
  public String getText() {
    return text;
  }

  /**
   * WITH 回复消息 [ t_response_sec.text ].
   *
   * @param text java.lang.String
   * @return org.github.spring.base.entity.ResponseSecEntity
   */
  public ResponseSecEntity withText(String text) {
    this.setText(text);
    return this;
  }

  /**
   * SET 回复消息 [ t_response_sec.text ].
   *
   * @param text java.lang.String
   */
  public void setText(String text) {
    this.text = text == null ? null : text.trim();
  }

  /**
   * GET 创建时间 [ t_response_sec.create_time ].
   *
   * @return java.util.Date
   */
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * WITH 创建时间 [ t_response_sec.create_time ].
   *
   * @param createTime java.util.Date
   * @return org.github.spring.base.entity.ResponseSecEntity
   */
  public ResponseSecEntity withCreateTime(Date createTime) {
    this.setCreateTime(createTime);
    return this;
  }

  /**
   * SET 创建时间 [ t_response_sec.create_time ].
   *
   * @param createTime java.util.Date
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}