/*
 * Spring ESPN WebMVC
 */
package com.infinitemule.espn.webmvc.service.now;

import java.util.List;

import com.infinitemule.espn.webmvc.model.now.NewsItem;

public interface EspnNowService {

  public List<NewsItem> getLatest();
  
}
