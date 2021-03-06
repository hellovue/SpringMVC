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
import org.github.spring.base.entity.AlbumEntity;
import org.github.spring.base.example.AlbumExample;
import org.github.spring.base.key.AlbumKey;
import org.github.spring.footstone.MyBatisMapper;

@QueryMapper
public interface AlbumMapper extends MyBatisMapper {
  long countByExample(AlbumExample example);

  int deleteByExample(AlbumExample example);

  @Delete({
    "delete from sampledb.album",
    "where id = #{id,jdbcType=INTEGER}"
  })
  int deleteByPrimaryKey(AlbumKey key);

  @Insert({
    "insert into sampledb.album (id, title, ",
    "image, content, ",
    "notice, `time`)",
    "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
    "#{image,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
    "#{notice,jdbcType=VARCHAR}, #{time,jdbcType=VARCHAR})"
  })
  int insert(AlbumEntity record);

  int insertSelective(AlbumEntity record);

  List<AlbumEntity> selectByExample(AlbumExample example);

  @Select({
    "select",
    "id, title, image, content, notice, `time`",
    "from sampledb.album",
    "where id = #{id,jdbcType=INTEGER}"
  })
  @ResultMap("org.github.spring.base.mapper.AlbumMapper.BaseResultMap")
  AlbumEntity selectByPrimaryKey(AlbumKey key);

  int updateByExampleSelective(@Param("record") AlbumEntity record, @Param("example") AlbumExample example);

  int updateByExample(@Param("record") AlbumEntity record, @Param("example") AlbumExample example);

  int updateByPrimaryKeySelective(AlbumEntity record);

  @Update({
    "update sampledb.album",
    "set title = #{title,jdbcType=VARCHAR},",
      "image = #{image,jdbcType=VARCHAR},",
      "content = #{content,jdbcType=VARCHAR},",
      "notice = #{notice,jdbcType=VARCHAR},",
      "`time` = #{time,jdbcType=VARCHAR}",
    "where id = #{id,jdbcType=INTEGER}"
  })
  int updateByPrimaryKey(AlbumEntity record);

  int batchInsert(List<AlbumEntity> list);

  int batchUpdate(List<AlbumEntity> list);

  int upsert(@Param("record") AlbumEntity record, @Param("array") String[] array);

  int upsertSelective(@Param("record") AlbumEntity record, @Param("array") String[] array);

  @Nullable
  AlbumEntity selectByUniqueKey(AlbumEntity record) throws TooManyResultsException;
}