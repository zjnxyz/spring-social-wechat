/*
 * Copyright 2010 the original author or authors.
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

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Operations;
import org.springframework.social.wechat.api.WeChat;
import org.springframework.social.wechat.api.impl.WeChatTemplate;
import org.springframework.social.wechat.constants.Const;

/**
 * WeChat ServiceProvider implementation.
 *
 * @author liangping
 */
public class WeChatServiceProvider<T> extends AbstractOAuth2ServiceProvider<WeChat> {

    public WeChatServiceProvider(OAuth2Operations oauth2Operations) {
        super(oauth2Operations);
    }

    public WeChatServiceProvider(String appId, String appSecret) {
        super(new WeChatOAuth2Template(appId, appSecret,
            Const.OPEN_WECHAT_DOMAIN+"/connect/qrconnect",
                Const.API_WECHAT_DOMAIN+"/sns/oauth2/access_token"));
    }

    @Override
    public WeChat getApi(String accessToken) {
        return new WeChatTemplate(accessToken);
    }


}