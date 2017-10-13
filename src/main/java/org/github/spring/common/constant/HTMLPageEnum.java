package org.github.spring.common.constant;

import lombok.NonNull;

import org.github.spring.restful.VIEWReturn;

/**
 * HTML page enum.
 *
 * @author JYD_XL
 */
public enum HTMLPageEnum implements VIEWReturn {
  INDEX("index"), HOME("home"), MAIN("main"), STAR("star");

  /** path. */
  private final String _path;

  /** Constructor. */
  HTMLPageEnum(@NonNull String path) {
    _path = path;
  }

  @Override
  public String get() {
    return PREFIX_HTML.concat(_path);
  }

  @Override
  public String toString() {
    return this.get();
  }
}
