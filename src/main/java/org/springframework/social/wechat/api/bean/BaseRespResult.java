package org.springframework.social.wechat.api.bean;

import java.io.Serializable;

/**
 * 类/接口注释
 *
 * @author jiangnan.zjn@alibaba-inc.com
 * @createDate 2017/8/20
 */
public class BaseRespResult implements Serializable {

    private static final long serialVersionUID = 2153030612230412786L;

    private String errcode;

    private String errmsg;

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    @Override
    public String toString() {
        return "BaseRespResult{" +
            "errcode='" + errcode + '\'' +
            ", errmsg='" + errmsg + '\'' +
            '}';
    }
}
