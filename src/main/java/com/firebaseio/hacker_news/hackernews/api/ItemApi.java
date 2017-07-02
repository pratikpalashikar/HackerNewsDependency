package com.firebaseio.hacker_news.hackernews.api;

import com.firebaseio.hacker_news.client.ApiException;
import com.firebaseio.hacker_news.client.ApiInvoker;
import com.firebaseio.hacker_news.hackernews.model.Item;
import com.sun.jersey.multipart.FormDataMultiPart;
import java.util.*;

public class ItemApi {
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
	 * Get the Item (story, comment, jobs, Ask HN, etc) Stories, comments, jobs,
	 * Ask HNs and even polls are just items. They're identified by their ids,
	 * which are unique integers.
	 * 
	 * @param id
	 *            Item ID
	 * @return Item
	 */
	public Item get(String id) throws ApiException {
		Object postBody = null;
		// verify required params are set
		if (id == null) {
			throw new ApiException(400, "missing required params");
		}
		// create path and map variables
		String path = "/item/{id}.json".replaceAll("\\{format\\}", "json").replaceAll("\\{" + "id" + "\\}",
				apiInvoker.escapeString(id.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		String[] contentTypes = { "application/x-www-form-urlencoded" };

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			if (hasFields)
				postBody = mp;
		} else {
		}

		// authentication setting
		boolean requireAuth = false;

		try {
			String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams,
					formParams, contentType, requireAuth);
			if (response != null) {
				return (Item) ApiInvoker.deserialize(response, "", Item.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			if (ex.getCode() == 404) {
				return null;
			} else {
				throw ex;
			}
		}
	}
	
	/**
	 * @author pratik Palashikar
	 * 
	 * Call this function to get the latest job ids and return it to the user.
	 * 
	 * @return List<Integer>
	 */
	public List<Integer> getAllJobIds()  {
		Object postBody = null;
		
		// create path and map variables
		String path = "/jobstories.json";

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();
		Map<String, String> formParams = new HashMap<String, String>();

		String[] contentTypes = { "application/x-www-form-urlencoded" };

		String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

		if (contentType.startsWith("multipart/form-data")) {
			boolean hasFields = false;
			FormDataMultiPart mp = new FormDataMultiPart();
			if (hasFields)
				postBody = mp;
		} else {
		}

		// authentication setting
		boolean requireAuth = false;

		try {
			String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams,
					formParams, contentType, requireAuth);
			if (response != null) {
				//Map this to the Integer list to return it to the existing users.
				return (List<Integer>) ApiInvoker.deserialize(response, "List", Integer.class);
			} else {
				return null;
			}
		} catch (ApiException ex) {
			if (ex.getCode() == 404) {
				return null;
			} 
		}
		return null;
	}
	
	
}
