//*****************************************************************************
// The file is automatically generated by the program, do not manually modify. 
//*****************************************************************************

package org.github.spring.base.entity;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import org.github.spring.base.key.AlbumKey;

/**
 * AlbumEntity [ sampledb.album ].
 *
 * @author MyBatisGenerator
 * @version 2017-09-21
 */
@EqualsAndHashCode(callSuper = true)
@SuppressWarnings("serial")
public class AlbumEntity extends AlbumKey implements Serializable {
  /** title [ album.title ]. */
  private String title;

  /** image [ album.image ]. */
  private String image;

  /** content [ album.content ]. */
  private String content;

  /** notice [ album.notice ]. */
  private String notice;

  /** time [ album.time ]. */
  private String time;

  /**
   * GET title [ album.title ].
   *
   * @return java.lang.String
   */
  public String getTitle() {
    return title;
  }

  /**
   * WITH title [ album.title ].
   *
   * @param title java.lang.String
   * @return org.github.spring.base.entity.AlbumEntity
   */
  public AlbumEntity withTitle(String title) {
    this.setTitle(title);
    return this;
  }

  /**
   * SET title [ album.title ].
   *
   * @param title java.lang.String
   */
  public void setTitle(String title) {
    this.title = title == null ? null : title.trim();
  }

  /**
   * GET image [ album.image ].
   *
   * @return java.lang.String
   */
  public String getImage() {
    return image;
  }

  /**
   * WITH image [ album.image ].
   *
   * @param image java.lang.String
   * @return org.github.spring.base.entity.AlbumEntity
   */
  public AlbumEntity withImage(String image) {
    this.setImage(image);
    return this;
  }

  /**
   * SET image [ album.image ].
   *
   * @param image java.lang.String
   */
  public void setImage(String image) {
    this.image = image == null ? null : image.trim();
  }

  /**
   * GET content [ album.content ].
   *
   * @return java.lang.String
   */
  public String getContent() {
    return content;
  }

  /**
   * WITH content [ album.content ].
   *
   * @param content java.lang.String
   * @return org.github.spring.base.entity.AlbumEntity
   */
  public AlbumEntity withContent(String content) {
    this.setContent(content);
    return this;
  }

  /**
   * SET content [ album.content ].
   *
   * @param content java.lang.String
   */
  public void setContent(String content) {
    this.content = content == null ? null : content.trim();
  }

  /**
   * GET notice [ album.notice ].
   *
   * @return java.lang.String
   */
  public String getNotice() {
    return notice;
  }

  /**
   * WITH notice [ album.notice ].
   *
   * @param notice java.lang.String
   * @return org.github.spring.base.entity.AlbumEntity
   */
  public AlbumEntity withNotice(String notice) {
    this.setNotice(notice);
    return this;
  }

  /**
   * SET notice [ album.notice ].
   *
   * @param notice java.lang.String
   */
  public void setNotice(String notice) {
    this.notice = notice == null ? null : notice.trim();
  }

  /**
   * GET time [ album.time ].
   *
   * @return java.lang.String
   */
  public String getTime() {
    return time;
  }

  /**
   * WITH time [ album.time ].
   *
   * @param time java.lang.String
   * @return org.github.spring.base.entity.AlbumEntity
   */
  public AlbumEntity withTime(String time) {
    this.setTime(time);
    return this;
  }

  /**
   * SET time [ album.time ].
   *
   * @param time java.lang.String
   */
  public void setTime(String time) {
    this.time = time == null ? null : time.trim();
  }
}