package com.firebaseio.hacker_news.hackernews.api;

import com.firebaseio.hacker_news.client.ApiException;
import com.firebaseio.hacker_news.client.ApiInvoker;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.MediaType;

import java.math.BigDecimal;
import java.io.File;
import java.util.*;

public class TopstoriesApi {
  String basePath = "https://hacker-news.firebaseio.com/v0";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  /**
   * Returns the current top 100 stories. 
   * Returns the current top 100 stories. 
   * @return List<Integer> 
   */
  public List<Integer> get () throws ApiException {
    Object postBody = null;
    // create path and map variables
    String path = "/topstories.json".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    String[] contentTypes = {
      "application/x-www-form-urlencoded"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    else {
      }

    // authentication setting
    boolean requireAuth = false;

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, requireAuth);
      if(response != null){
        return (List<Integer>) ApiInvoker.deserialize(response, "List", Integer.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  }


