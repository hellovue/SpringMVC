package org.github.spring.module.home.action;

import java.util.Arrays;
import java.util.Map;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;
import lombok.val;

import org.github.spring.annotation.Invoke;
import org.github.spring.base.AbstractAction;
import org.github.spring.common.constant.HTMLPageEnum;
import org.github.spring.module.home.model.TeacherCondModel;
import org.github.spring.module.home.service.IHomeService;
import org.github.spring.restful.FileReturn;
import org.github.spring.restful.JSONReturn;
import org.github.spring.restful.MultiFileReturn;
import org.github.spring.restful.Returnable;
import org.github.spring.restful.json.JSONArrayReturn;
import org.github.spring.restful.json.JSONPReturn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * HomeAction.
 *
 * @author JYD_XL
 */
@Slf4j
@Controller
@RequestMapping("/home/")
public class HomeAction extends AbstractAction {
  @Resource
  private IHomeService homeService;

  /**
   * format.
   *
   * @return JSONReturn
   */
  @GetMapping("export")
  public Returnable export(TeacherCondModel condModel) {
    val origin = ((JSONArrayReturn) this.search(condModel)).toList();
    val titles = Arrays.asList("title1", "title2", "title3");
    val fields = Arrays.asList("username", "password", "question");
    return FileReturn.of("demo", titles, fields, origin);
  }

  /**
   * format.
   *
   * @return JSONReturn
   */
  @GetMapping("file")
  public Returnable file() {
    return MultiFileReturn.of("/**/*");
  }

  /**
   * holder.
   *
   * @return JSONReturn
   */
  @GetMapping("jsonp")
  public Returnable holder(String name) {
    return JSONPReturn.of("bilibili", "JYD_XL", 1, 2, 3, name);
  }

  /**
   * home.
   *
   * @return VIEWReturn
   */
  @GetMapping
  public Returnable home() {
    return HTMLPageEnum.HOME;
  }

  /**
   * lambda.
   *
   * @return JSONReturn
   */
  @PostMapping("lambda")
  public Returnable lambda(@Invoke Map<String, Object> param) {
    return JSONReturn.of(param);
  }

  /**
   * search.
   *
   * @return JSONReturn
   */
  @GetMapping("ssm")
  public Returnable search(TeacherCondModel condModel) {
    return homeService.search(condModel);
  }
}