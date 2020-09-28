package com.mize.cxconnect.json.util;

import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

/**
 * @author srikanthkanumuri
 *
 */
@Component
public class JSONPathUtility {

	private Configuration config;

	/**
	 * 
	 */
	public JSONPathUtility() {
		config = Configuration.defaultConfiguration();
		config = config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
	}

	/**
	 * @param jsonString
	 * @return
	 */
	public DocumentContext parse(String jsonString) {
		return JsonPath.using(config).parse(jsonString);
	}

	/**
	 * @param jsonStream
	 * @return
	 */
	public DocumentContext parse(InputStream jsonStream) {
		return JsonPath.using(config).parse(jsonStream);
	}
}

