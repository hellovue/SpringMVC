//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.mapper;

import java.util.List;
import javax.annotation.Nullable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.github.spring.annotation.QueryMapper;
import org.github.spring.base.entity.AuthoritiesEntity;
import org.github.spring.base.example.AuthoritiesExample;
import org.github.spring.footstone.MyBatisMapper;

@QueryMapper
public interface AuthoritiesMapper extends MyBatisMapper {
  long countByExample(AuthoritiesExample example);

  int deleteByExample(AuthoritiesExample example);

  @Insert({
    "insert into sampledb.authorities (username, authority)",
    "values (#{username,jdbcType=VARCHAR}, #{authority,jdbcType=VARCHAR})"
  })
  int insert(AuthoritiesEntity record);

  int insertSelective(AuthoritiesEntity record);

  List<AuthoritiesEntity> selectByExample(AuthoritiesExample example);

  int updateByExampleSelective(@Param("record") AuthoritiesEntity record, @Param("example") AuthoritiesExample example);

  int updateByExample(@Param("record") AuthoritiesEntity record, @Param("example") AuthoritiesExample example);

  int batchInsert(List<AuthoritiesEntity> list);

  int batchUpdate(List<AuthoritiesEntity> list);

  int upsert(@Param("record") AuthoritiesEntity record, @Param("array") String[] array);

  int upsertSelective(@Param("record") AuthoritiesEntity record, @Param("array") String[] array);

  @Nullable
  AuthoritiesEntity selectByUniqueKey(AuthoritiesEntity record) throws TooManyResultsException;
}