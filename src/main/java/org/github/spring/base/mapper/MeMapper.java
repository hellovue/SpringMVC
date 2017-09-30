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
import org.github.spring.base.entity.MeEntity;
import org.github.spring.base.example.MeExample;
import org.github.spring.base.key.MeKey;
import org.github.spring.footstone.MyBatisMapper;

@QueryInterface
public interface MeMapper extends MyBatisMapper {
  long countByExample(MeExample example);

  int deleteByExample(MeExample example);

  @Delete({
    "delete from sampledb.me",
    "where id = #{id,jdbcType=INTEGER}"
  })
  int deleteByPrimaryKey(MeKey key);

  @Insert({
    "insert into sampledb.me (id, content, ",
    "`name`, notice)",
    "values (#{id,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
    "#{name,jdbcType=VARCHAR}, #{notice,jdbcType=VARCHAR})"
  })
  int insert(MeEntity record);

  int insertSelective(MeEntity record);

  List<MeEntity> selectByExample(MeExample example);

  @Select({
    "select",
    "id, content, `name`, notice",
    "from sampledb.me",
    "where id = #{id,jdbcType=INTEGER}"
  })
  @ResultMap("org.github.spring.base.mapper.MeMapper.BaseResultMap")
  MeEntity selectByPrimaryKey(MeKey key);

  int updateByExampleSelective(@Param("record") MeEntity record, @Param("example") MeExample example);

  int updateByExample(@Param("record") MeEntity record, @Param("example") MeExample example);

  int updateByPrimaryKeySelective(MeEntity record);

  @Update({
    "update sampledb.me",
    "set content = #{content,jdbcType=VARCHAR},",
      "`name` = #{name,jdbcType=VARCHAR},",
      "notice = #{notice,jdbcType=VARCHAR}",
    "where id = #{id,jdbcType=INTEGER}"
  })
  int updateByPrimaryKey(MeEntity record);

  int batchInsert(List<MeEntity> list);

  int batchUpdate(List<MeEntity> list);

  int upsert(@Param("record") MeEntity record, @Param("array") String[] array);

  int upsertSelective(@Param("record") MeEntity record, @Param("array") String[] array);

  @Nullable
  MeEntity selectByUniqueKey(MeEntity record) throws TooManyResultsException;
}