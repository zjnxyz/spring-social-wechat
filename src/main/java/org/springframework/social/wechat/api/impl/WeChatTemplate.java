package org.springframework.social.wechat.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;
import org.springframework.social.support.URIBuilder;
import org.springframework.social.wechat.api.WeChat;
import org.springframework.social.wechat.api.bean.User;
import org.springframework.social.wechat.api.operation.UserOperations;
import org.springframework.web.client.RestOperations;

public class WeChatTemplate extends AbstractOAuth2ApiBinding implements WeChat {

	public WeChatTemplate() {
		super();
	}

	public WeChatTemplate(String accessToken, TokenStrategy tokenStrategy) {
		super(accessToken, tokenStrategy);
	}

	public WeChatTemplate(String accessToken) {
		super(accessToken);
	}

	public RestOperations restOperations() {
		return getRestTemplate();
	}

	public UserOperations userOperations() {
		return null;
	}

	static final String URI_USERINFO = "https://api.weixin.qq.com/cgi-bin/user/info";
	
	public User getWeixinUser(String openid) {
		User user = this.getRestTemplate().getForObject(URIBuilder.fromUri(URI_USERINFO).queryParam("openid", openid).toString(), User.class);
		return user;
	}

}
