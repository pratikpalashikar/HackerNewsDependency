package com.firebaseio.hacker_news.hackernews.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListIds {

	
	private List<Integer> list = null;

	@JsonProperty
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	
	
}
