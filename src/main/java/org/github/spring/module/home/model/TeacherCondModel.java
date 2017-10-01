package org.github.spring.module.home.model;

import lombok.Setter;
import org.github.spring.annotation.Column;
import org.github.spring.common.constant.CodeIndex;
import org.github.spring.enumeration.Flag;
import org.github.spring.footstone.AbstractEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * TeacherCondModel.
 * Bean and Method as unit.
 *
 * @author JYD_XL
 */
@Setter
public class TeacherCondModel extends AbstractEntity implements CodeIndex {
  /** number. */
  @Column
  private BigDecimal number;

  /** number. */
  @DateTimeFormat(pattern = FORMAT_DATE)
  private Date datetime;

  @Column(flag = Flag.GREATER_THAN_OR_EQUAL_TO, goal = "time")
  public Date getDatetime() {
    return datetime;
  }
}
