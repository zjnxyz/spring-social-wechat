package org.springframework.social.wechat.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;
import org.springframework.social.support.URIBuilder;
import org.springframework.social.wechat.api.WeChat;
import org.springframework.social.wechat.api.bean.User;
import org.springframework.social.wechat.api.bean.WeChatUserInfo;
import org.springframework.social.wechat.api.operation.UserOperations;
import org.springframework.social.wechat.constants.Const;
import org.springframework.web.client.RestOperations;

public class WeChatTemplate extends AbstractOAuth2ApiBinding implements WeChat {

	private final String accessToken;

	public WeChatTemplate() {
		super();
		accessToken = null;
	}

	public WeChatTemplate(String accessToken, TokenStrategy tokenStrategy) {
		super(accessToken, tokenStrategy);
		this.accessToken = accessToken;
	}

	public WeChatTemplate(String accessToken) {
		super(accessToken);
		this.accessToken = accessToken;
	}

	public RestOperations restOperations() {
		return getRestTemplate();
	}

	public UserOperations userOperations() {
		return null;
	}

	static final String URI_USERINFO = Const.API_WECHAT_DOMAIN+"/sns/userinfo";
	
	public WeChatUserInfo getWeixinUser(String openid) {
		if(accessToken == null){
			System.out.println("accessToken is null");
			return null;
		}
		String url = URIBuilder.fromUri(URI_USERINFO)
			.queryParam("openid", openid).queryParam("access_token", accessToken)
			.build().toString();

		WeChatUserInfo user = this.getRestTemplate().getForObject(url, WeChatUserInfo.class);
		return user;
	}

}
