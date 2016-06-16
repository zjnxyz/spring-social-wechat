package org.springframework.social.wechat.api.operation;

import org.springframework.social.wechat.api.bean.User;

public interface UserOperations {

	public User getWeChatUser(String openid);
	
}
