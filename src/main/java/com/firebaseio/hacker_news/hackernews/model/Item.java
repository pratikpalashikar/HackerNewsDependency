package com.firebaseio.hacker_news.hackernews.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
  /* By */
  private String by = null;
  /* ID */
  private Integer id = null;
  /* The ids of the item's comments, in ranked display order. */
  private Integer kids = null;
  /* The item's parent. For comments, either another comment or the relevant story. For pollopts, the relevant poll. */
  private Integer parent = null;
  /* A list of related pollopts, in display order. */
  private Integer parts = null;
  /* The story's score, or the votes for a pollopt. */
  private Integer score = null;
  /* Text */
  private String text = null;
  /* Time */
  private Integer time = null;
  /* Title */
  private String title = null;
  /* The title of the story or poll. */
  private String type = null;
  /* The URL of the story. */
  private String url = null;
  @JsonProperty("by")
  public String getBy() {
    return by;
  }
  public void setBy(String by) {
    this.by = by;
  }

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("kids")
  public Integer getKids() {
    return kids;
  }
  public void setKids(Integer kids) {
    this.kids = kids;
  }

  @JsonProperty("parent")
  public Integer getParent() {
    return parent;
  }
  public void setParent(Integer parent) {
    this.parent = parent;
  }

  @JsonProperty("parts")
  public Integer getParts() {
    return parts;
  }
  public void setParts(Integer parts) {
    this.parts = parts;
  }

  @JsonProperty("score")
  public Integer getScore() {
    return score;
  }
  public void setScore(Integer score) {
    this.score = score;
  }

  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  @JsonProperty("time")
  public Integer getTime() {
    return time;
  }
  public void setTime(Integer time) {
    this.time = time;
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("  by: ").append(by).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  kids: ").append(kids).append("\n");
    sb.append("  parent: ").append(parent).append("\n");
    sb.append("  parts: ").append(parts).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

