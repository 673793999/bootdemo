package com.jtl.common.response;

/**
 * Created by Administrator on 2016/10/28 0028.
 */
public class AppResponse<T>{

    public AppResponse (RESPONSE enmu, T val){
        this.code = enmu.getCode();
        this.mes = enmu.getMes();
        this.val = val;
    }

    /**
     * app响应
     */
    public enum RESPONSE{

        SUCCESS("000","操作成功"),
        ERROR("50000","系统异常"),
        USER_CONTAIN("用户以存在","50008092"),
        USER_VALIDATE_FAILED("50008003","用户验证码验证失败"),
        USER_VALIDATE_MOBILE_FAILED("50008103","获取手机验证码失败"),
        USER_VALIDATE_TIMEOUT("50008105","用户验证码超时"),
        CHECK_ERROR("50001","请求参数错误");
        RESPONSE(String c,String m){
            this.c = c;
            this.m = m;
        }
        private String c;
        private String m;

        public String getCode(){
            return this.c;
        }
        public String getMes(){
            return this.m;
        }

    }


    protected  String code;
    protected  String mes;
    private T val;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

}
