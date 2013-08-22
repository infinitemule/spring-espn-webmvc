package com.infinitemule.espn.webmvc.model.now;

import java.util.Date;

public class NewsItem {
  
  private String title;
  private String description;
  
  private Date published;
  
  private String webLink;
  private String mobileLink;
  
  public NewsItem() {
    
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getPublished() {
    return published;
  }

  public void setPublished(Date published) {
    this.published = published;
  }

  public String getWebLink() {
    return webLink;
  }

  public void setWebLink(String webLink) {
    this.webLink = webLink;
  }

  public String getMobileLink() {
    return mobileLink;
  }

  public void setMobileLink(String mobileLink) {
    this.mobileLink = mobileLink;
  }
      
}
