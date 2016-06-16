/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.wechat.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.wechat.api.WeChat;

/**
 * WeChat ApiAdapter implementation.
 * @author liangping
 */
public class WeChatAdapter implements ApiAdapter<WeChat> {

	public boolean test(WeChat weChat) {
		return weChat.getWeixinUser(null)!=null?true:false;
	}

	public void setConnectionValues(WeChat weChat, ConnectionValues values) {
//		TwitterProfile profile = weChat.restOperations().getUserProfile();
//		values.setProviderUserId(Long.toString(profile.getId()));
//		values.setDisplayName("@" + profile.getScreenName());
//		values.setProfileUrl(profile.getProfileUrl());
//		values.setImageUrl(profile.getProfileImageUrl());
	}

	public UserProfile fetchUserProfile(WeChat weChat) {
		//TwitterProfile profile = twitter.userOperations().getUserProfile();
		//return new UserProfileBuilder().setName(profile.getName()).setUsername(profile.getScreenName()).build();
		return null;
	}
	
	public void updateStatus(WeChat weChat, String message) {
		//twitter.timelineOperations().updateStatus(message);	
	}
	
}