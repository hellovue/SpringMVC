//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.key;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.footstone.AbstractEntity;

/**
 * ResponseSecKey [ sampledb.t_response_sec ].
 *
 * @author MyBatisGenerator
 * @version 2017-10-14
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class ResponseSecKey extends AbstractEntity implements Serializable {
  /** 二级回复ID编号（主键） [ t_response_sec.respond_id ]. */
  private String respondId;

  /**
   * GET 二级回复ID编号（主键） [ t_response_sec.respond_id ].
   *
   * @return java.lang.String
   */
  public String getRespondId() {
    return respondId;
  }

  /**
   * WITH 二级回复ID编号（主键） [ t_response_sec.respond_id ].
   *
   * @param respondId java.lang.String
   * @return org.github.spring.base.key.ResponseSecKey
   */
  public ResponseSecKey withRespondId(String respondId) {
    this.setRespondId(respondId);
    return this;
  }

  /**
   * SET 二级回复ID编号（主键） [ t_response_sec.respond_id ].
   *
   * @param respondId java.lang.String
   */
  public void setRespondId(String respondId) {
    this.respondId = respondId == null ? null : respondId.trim();
  }
}