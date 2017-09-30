//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.key;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.footstone.AbstractEntity;

/**
 * PhotoKey [ sampledb.photo ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class PhotoKey extends AbstractEntity implements Serializable {
  /** id [ photo.id ]. */
  private Integer id;

  /**
   * GET id [ photo.id ].
   *
   * @return java.lang.Integer
   */
  public Integer getId() {
    return id;
  }

  /**
   * WITH id [ photo.id ].
   *
   * @param id java.lang.Integer
   * @return org.github.spring.base.key.PhotoKey
   */
  public PhotoKey withId(Integer id) {
    this.setId(id);
    return this;
  }

  /**
   * SET id [ photo.id ].
   *
   * @param id java.lang.Integer
   */
  public void setId(Integer id) {
    this.id = id;
  }
}