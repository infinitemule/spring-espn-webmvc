package com.infinitemule.espn.webmvc.service.now;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.infinitemule.espn.api.now.Feed;
import com.infinitemule.espn.api.now.NowApiRequest;
import com.infinitemule.espn.api.now.NowApiResponse;
import com.infinitemule.espn.api.now.NowApiService;
import com.infinitemule.espn.webmvc.model.now.NewsItem;


@Component
public class EspnNowServiceApi implements EspnNowService {

  @Autowired
  private NowApiService srv = null;
  
  @Override
  public List<NewsItem> getLatest() {
    
    NowApiResponse resp = srv.call(new NowApiRequest().latest());
        
    List<NewsItem> items = new ArrayList<NewsItem>();

    for(Feed feed : resp.getFeed()) {            
      items.add(convertFeed(feed));      
    }
    
    
    return items;
  }
  
    
  private NewsItem convertFeed(Feed feed) {
    
    NewsItem item = new NewsItem();
    
    item.setTitle(feed.getHeadline());
    item.setDescription(feed.getDescription());
    
    item.setPublished(feed.getPublished());
    
    item.setMobileLink(feed.getLinks().getMobileUrl());
    item.setWebLink(feed.getLinks().getWebUrl());

    
    return item;
  }

}
