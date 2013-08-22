/*
 * Spring ESPN WebMVC
 */
package com.infinitemule.espn.webmvc.mvc.now;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EspnNowController {

  @RequestMapping("/now")
  public ModelAndView home() {
            
    return new ModelAndView("now/home");
  }
  
}
