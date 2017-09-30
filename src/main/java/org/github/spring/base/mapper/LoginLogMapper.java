//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.mapper;

import java.util.List;
import javax.annotation.Nullable;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.github.spring.annotation.QueryInterface;
import org.github.spring.base.entity.LoginLogEntity;
import org.github.spring.base.example.LoginLogExample;
import org.github.spring.base.key.LoginLogKey;
import org.github.spring.footstone.MyBatisMapper;

@QueryInterface
public interface LoginLogMapper extends MyBatisMapper {
  long countByExample(LoginLogExample example);

  int deleteByExample(LoginLogExample example);

  @Delete({
    "delete from sampledb.t_login_log",
    "where login_log_id = #{loginLogId,jdbcType=INTEGER}"
  })
  int deleteByPrimaryKey(LoginLogKey key);

  @Insert({
    "insert into sampledb.t_login_log (login_log_id, user_id, ",
    "ip, login_datetime)",
    "values (#{loginLogId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
    "#{ip,jdbcType=VARCHAR}, #{loginDatetime,jdbcType=TIMESTAMP})"
  })
  int insert(LoginLogEntity record);

  int insertSelective(LoginLogEntity record);

  List<LoginLogEntity> selectByExample(LoginLogExample example);

  @Select({
    "select",
    "login_log_id, user_id, ip, login_datetime",
    "from sampledb.t_login_log",
    "where login_log_id = #{loginLogId,jdbcType=INTEGER}"
  })
  @ResultMap("org.github.spring.base.mapper.LoginLogMapper.BaseResultMap")
  LoginLogEntity selectByPrimaryKey(LoginLogKey key);

  int updateByExampleSelective(@Param("record") LoginLogEntity record, @Param("example") LoginLogExample example);

  int updateByExample(@Param("record") LoginLogEntity record, @Param("example") LoginLogExample example);

  int updateByPrimaryKeySelective(LoginLogEntity record);

  @Update({
    "update sampledb.t_login_log",
    "set user_id = #{userId,jdbcType=INTEGER},",
      "ip = #{ip,jdbcType=VARCHAR},",
      "login_datetime = #{loginDatetime,jdbcType=TIMESTAMP}",
    "where login_log_id = #{loginLogId,jdbcType=INTEGER}"
  })
  int updateByPrimaryKey(LoginLogEntity record);

  int batchInsert(List<LoginLogEntity> list);

  int batchUpdate(List<LoginLogEntity> list);

  int upsert(@Param("record") LoginLogEntity record, @Param("array") String[] array);

  int upsertSelective(@Param("record") LoginLogEntity record, @Param("array") String[] array);

  @Nullable
  LoginLogEntity selectByUniqueKey(LoginLogEntity record) throws TooManyResultsException;
}