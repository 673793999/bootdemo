package com.jtl.smscenter.form;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public class SmsMessage implements Serializable {
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * mobile:（手机号）
     * @since 1.0.0
     */
    private String mobile;

    /**
     * message:内容
     * @since 1.0.0
     */
    private String message;
}
