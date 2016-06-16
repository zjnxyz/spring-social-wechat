package org.springframework.social.wechat.api;

import java.util.HashMap;
import java.util.Map;

public abstract class WeChatObject {
	private Map<String, Object> extraData;

	public WeChatObject() {
		extraData = new HashMap<String, Object>();
	}
	public Map<String, Object> getExtraData() {
		return extraData;
	}
	protected void add(String key, Object value) {
		extraData.put(key, value);
	}
	
}
