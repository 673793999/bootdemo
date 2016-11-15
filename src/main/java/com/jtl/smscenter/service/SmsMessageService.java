package com.jtl.smscenter.service;

import com.jtl.smscenter.form.SmsMessage;

/**
 * Created by Administrator on 2016/11/2 0002.
 */
public interface SmsMessageService {

    /**
     * 短信发送接口
     * @param msg
     * @return
     */
    public  String noteFare(SmsMessage msg);
}
