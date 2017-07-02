package com.firebaseio.hacker_news.hackernews.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class Updates {
  /* Items */
  private List<Long> items = new ArrayList<Long>();
  /* Profiles */
  private List<String> profiles = new ArrayList<String>();
  @JsonProperty("items")
  public List<Long> getItems() {
    return items;
  }
  public void setItems(List<Long> items) {
    this.items = items;
  }

  @JsonProperty("profiles")
  public List<String> getProfiles() {
    return profiles;
  }
  public void setProfiles(List<String> profiles) {
    this.profiles = profiles;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Updates {\n");
    sb.append("  items: ").append(items).append("\n");
    sb.append("  profiles: ").append(profiles).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

