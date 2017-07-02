package com.firebaseio.hacker_news.hackernews.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
public class User {
  /* About */
  private String about = null;
  /* Created */
  private Long created = null;
  /* Delay */
  private Long delay = null;
  /* ID */
  private String id = null;
  /* Karma */
  private Long karma = null;
  /* Submitted */
  private List<Long> submitted = new ArrayList<Long>();
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  @JsonProperty("created")
  public Long getCreated() {
    return created;
  }
  public void setCreated(Long created) {
    this.created = created;
  }

  @JsonProperty("delay")
  public Long getDelay() {
    return delay;
  }
  public void setDelay(Long delay) {
    this.delay = delay;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @JsonProperty("karma")
  public Long getKarma() {
    return karma;
  }
  public void setKarma(Long karma) {
    this.karma = karma;
  }

  @JsonProperty("submitted")
  public List<Long> getSubmitted() {
    return submitted;
  }
  public void setSubmitted(List<Long> submitted) {
    this.submitted = submitted;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  about: ").append(about).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  delay: ").append(delay).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  karma: ").append(karma).append("\n");
    sb.append("  submitted: ").append(submitted).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

