package org.springframework.social.wechat.api.impl;

import org.springframework.social.support.URIBuilder;
import org.springframework.social.wechat.api.WeChat;
import org.springframework.social.wechat.api.bean.User;
import org.springframework.social.wechat.api.operation.UserOperations;
import org.springframework.web.client.RestTemplate;

public class WeChatUserTemplate implements UserOperations {
	
	static final String URI = "https://api.weixin.qq.com/sns/oauth2/access_token"; 
	static final String URI_USERINFO = "https://api.weixin.qq.com/cgi-bin/user/info";
	private RestTemplate rest;
	private WeChat weChatApi;
	private User user;

	public WeChatUserTemplate(RestTemplate rest, WeChat weChatApi) {
		super();
		this.rest = rest;
		this.weChatApi = weChatApi;
	}

	public User getWeChatUser(String openid) {
		user = rest.getForObject(URIBuilder.fromUri(URI_USERINFO).queryParam("openid", openid).toString(), User.class);
		return user;
	}

}
