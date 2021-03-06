//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.key;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.footstone.AbstractEntity;

/**
 * SourceKey [ sampledb.t_source ].
 *
 * @author MyBatisGenerator
 * @version 2017-10-14
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class SourceKey extends AbstractEntity implements Serializable {
  /** 资源ID（主键） [ t_source.source_id ]. */
  private String sourceId;

  /**
   * GET 资源ID（主键） [ t_source.source_id ].
   *
   * @return java.lang.String
   */
  public String getSourceId() {
    return sourceId;
  }

  /**
   * WITH 资源ID（主键） [ t_source.source_id ].
   *
   * @param sourceId java.lang.String
   * @return org.github.spring.base.key.SourceKey
   */
  public SourceKey withSourceId(String sourceId) {
    this.setSourceId(sourceId);
    return this;
  }

  /**
   * SET 资源ID（主键） [ t_source.source_id ].
   *
   * @param sourceId java.lang.String
   */
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId == null ? null : sourceId.trim();
  }
}