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
import org.github.spring.annotation.QueryMapper;
import org.github.spring.base.entity.UsersEntity;
import org.github.spring.base.example.UsersExample;
import org.github.spring.base.key.UsersKey;
import org.github.spring.footstone.MyBatisMapper;

@QueryMapper
public interface UsersMapper extends MyBatisMapper {
  long countByExample(UsersExample example);

  int deleteByExample(UsersExample example);

  @Delete({
    "delete from sampledb.t_users",
    "where user_id = #{userId,jdbcType=VARCHAR}"
  })
  int deleteByPrimaryKey(UsersKey key);

  @Insert({
    "insert into sampledb.t_users (user_id, username, ",
    "`password`, question, ",
    "answer, user_img, ",
    "regtime)",
    "values (#{userId,jdbcType=VARCHAR}, #{username,jdbcType=VARCHAR}, ",
    "#{password,jdbcType=VARCHAR}, #{question,jdbcType=VARCHAR}, ",
    "#{answer,jdbcType=VARCHAR}, #{userImg,jdbcType=VARCHAR}, ",
    "#{regtime,jdbcType=TIMESTAMP})"
  })
  int insert(UsersEntity record);

  int insertSelective(UsersEntity record);

  List<UsersEntity> selectByExample(UsersExample example);

  @Select({
    "select",
    "user_id, username, `password`, question, answer, user_img, regtime",
    "from sampledb.t_users",
    "where user_id = #{userId,jdbcType=VARCHAR}"
  })
  @ResultMap("org.github.spring.base.mapper.UsersMapper.BaseResultMap")
  UsersEntity selectByPrimaryKey(UsersKey key);

  int updateByExampleSelective(@Param("record") UsersEntity record, @Param("example") UsersExample example);

  int updateByExample(@Param("record") UsersEntity record, @Param("example") UsersExample example);

  int updateByPrimaryKeySelective(UsersEntity record);

  @Update({
    "update sampledb.t_users",
    "set username = #{username,jdbcType=VARCHAR},",
      "`password` = #{password,jdbcType=VARCHAR},",
      "question = #{question,jdbcType=VARCHAR},",
      "answer = #{answer,jdbcType=VARCHAR},",
      "user_img = #{userImg,jdbcType=VARCHAR},",
      "regtime = #{regtime,jdbcType=TIMESTAMP}",
    "where user_id = #{userId,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKey(UsersEntity record);

  int batchInsert(List<UsersEntity> list);

  int batchUpdate(List<UsersEntity> list);

  int upsert(@Param("record") UsersEntity record, @Param("array") String[] array);

  int upsertSelective(@Param("record") UsersEntity record, @Param("array") String[] array);

  @Nullable
  UsersEntity selectByUniqueKey(UsersEntity record) throws TooManyResultsException;
}