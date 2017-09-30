//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.ResponseOneKey;

/**
 * ResponseOneEntity [ sampledb.t_response_one ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class ResponseOneEntity extends ResponseOneKey implements Serializable {
  /** 用户ID（外键） [ t_response_one.user_id ]. */
  private String userId;

  /** 文章ID（外键） [ t_response_one.tid ]. */
  private String tid;

  /** 回复消息 [ t_response_one.text ]. */
  private String text;

  /** 二级回复ID（值唯一） [ t_response_one.respond ]. */
  private String respond;

  /** 创建时间 [ t_response_one.create_time ]. */
  private Date createTime;

  /**
   * GET 用户ID（外键） [ t_response_one.user_id ].
   *
   * @return java.lang.String
   */
  public String getUserId() {
    return userId;
  }

  /**
   * WITH 用户ID（外键） [ t_response_one.user_id ].
   *
   * @param userId java.lang.String
   * @return org.github.spring.base.entity.ResponseOneEntity
   */
  public ResponseOneEntity withUserId(String userId) {
    this.setUserId(userId);
    return this;
  }

  /**
   * SET 用户ID（外键） [ t_response_one.user_id ].
   *
   * @param userId java.lang.String
   */
  public void setUserId(String userId) {
    this.userId = userId == null ? null : userId.trim();
  }

  /**
   * GET 文章ID（外键） [ t_response_one.tid ].
   *
   * @return java.lang.String
   */
  public String getTid() {
    return tid;
  }

  /**
   * WITH 文章ID（外键） [ t_response_one.tid ].
   *
   * @param tid java.lang.String
   * @return org.github.spring.base.entity.ResponseOneEntity
   */
  public ResponseOneEntity withTid(String tid) {
    this.setTid(tid);
    return this;
  }

  /**
   * SET 文章ID（外键） [ t_response_one.tid ].
   *
   * @param tid java.lang.String
   */
  public void setTid(String tid) {
    this.tid = tid == null ? null : tid.trim();
  }

  /**
   * GET 回复消息 [ t_response_one.text ].
   *
   * @return java.lang.String
   */
  public String getText() {
    return text;
  }

  /**
   * WITH 回复消息 [ t_response_one.text ].
   *
   * @param text java.lang.String
   * @return org.github.spring.base.entity.ResponseOneEntity
   */
  public ResponseOneEntity withText(String text) {
    this.setText(text);
    return this;
  }

  /**
   * SET 回复消息 [ t_response_one.text ].
   *
   * @param text java.lang.String
   */
  public void setText(String text) {
    this.text = text == null ? null : text.trim();
  }

  /**
   * GET 二级回复ID（值唯一） [ t_response_one.respond ].
   *
   * @return java.lang.String
   */
  public String getRespond() {
    return respond;
  }

  /**
   * WITH 二级回复ID（值唯一） [ t_response_one.respond ].
   *
   * @param respond java.lang.String
   * @return org.github.spring.base.entity.ResponseOneEntity
   */
  public ResponseOneEntity withRespond(String respond) {
    this.setRespond(respond);
    return this;
  }

  /**
   * SET 二级回复ID（值唯一） [ t_response_one.respond ].
   *
   * @param respond java.lang.String
   */
  public void setRespond(String respond) {
    this.respond = respond == null ? null : respond.trim();
  }

  /**
   * GET 创建时间 [ t_response_one.create_time ].
   *
   * @return java.util.Date
   */
  public Date getCreateTime() {
    return createTime;
  }

  /**
   * WITH 创建时间 [ t_response_one.create_time ].
   *
   * @param createTime java.util.Date
   * @return org.github.spring.base.entity.ResponseOneEntity
   */
  public ResponseOneEntity withCreateTime(Date createTime) {
    this.setCreateTime(createTime);
    return this;
  }

  /**
   * SET 创建时间 [ t_response_one.create_time ].
   *
   * @param createTime java.util.Date
   */
  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }
}