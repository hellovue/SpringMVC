package org.github.spring.common.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.github.spring.common.base.Service;
import org.github.spring.common.dao.CommonDao;
import org.github.spring.common.service.ICommonService;

/**
 * CommonService.
 *
 * @author JYD_XL
 */
public abstract class CommonService extends Service implements ICommonService {
  @Resource
  private transient CommonDao commonDao;

  @Override
  public Date getNow() {
    return commonDao.getNow();
  }
}