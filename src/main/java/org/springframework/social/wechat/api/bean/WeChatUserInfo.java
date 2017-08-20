package org.springframework.social.wechat.api.bean;

import java.io.Serializable;

/**
 * 类/接口注释
 *
 * @author jiangnan.zjn@alibaba-inc.com
 * @createDate 2017/8/20
 */
public class WeChatUserInfo extends BaseRespResult implements Serializable {

    private static final long serialVersionUID = 6783353420189072740L;

    private String openid;

    private String nickname;

    private String province;

    private String city;

    private String country;

    private String headimgurl;

    private String unionid;

    private Integer sex;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "WeChatUserInfo{" +
            "openid='" + openid + '\'' +
            ", nickname='" + nickname + '\'' +
            ", province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", country='" + country + '\'' +
            ", headimgurl='" + headimgurl + '\'' +
            ", unionid='" + unionid + '\'' +
            ", sex=" + sex +
            '}';
    }
}
