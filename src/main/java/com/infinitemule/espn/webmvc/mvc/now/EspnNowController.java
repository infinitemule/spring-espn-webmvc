/*
 * Spring ESPN WebMVC
 */
package com.infinitemule.espn.webmvc.mvc.now;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infinitemule.espn.webmvc.service.now.EspnNowService;

@Controller
public class EspnNowController {

  @Autowired
  private EspnNowService srv = null;
  
  @RequestMapping("/now")
  public ModelAndView home(ModelAndView mav) {

    mav.addObject("feeds", srv.getLatest());    
    mav.setViewName("now/home");
    
    return mav;
  }
  
}
