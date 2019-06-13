package com.cyd.project.design.patterns.create.builder;

import org.springframework.boot.configurationprocessor.json.JSONObject;

/**
 * @Description 建造者模式在工作中的应用
 * @Author changyandong@e6yun.com
 * @Emoji (゜ - ゜)つ干杯
 * @Created Date: 2019/6/10 15:00
 * @ClassName ApiResultBean
 * @Version: 1.0
 */
public class ApiResultBean {
    private Integer code;
    private String message;
    private JSONObject data;

    public ApiResultBean() {
    }

    public ApiResultBean(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResultBean(Integer code, String message, JSONObject data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public static ApiResultBean success(){
        return new ApiResultBean(200,"成功");
    }

    public static ApiResultBean success(String message){
        return new ApiResultBean(200,message);
    }

    public static ApiResultBean error(Integer code,String message){
        return new ApiResultBean(code,message);
    }

    public static ApiResultBeanBuilder from() {

        return new ApiResultBeanBuilder() {

            private Integer code;

            private String message;

            private JSONObject data;

            @Override
            public ApiResultBeanBuilder code(Integer code) {
                this.code = code;
                return this;
            }

            @Override
            public ApiResultBeanBuilder message(String message) {
                this.message = message;
                return this;
            }

            @Override
            public ApiResultBeanBuilder data(JSONObject data) {
                this.data = data;
                return this;
            }

            @Override
            public ApiResultBean build() {
                return new ApiResultBean(this.code,this.message,this.data);
            }

        };
    }

    public interface ApiResultBeanBuilder {
        /**
         * 返回参数
         * @param code
         * @return
         */
        ApiResultBeanBuilder code(Integer code);

        /**
         * 返回参数
         * @param message
         * @return
         */
        ApiResultBeanBuilder message(String message);

        /**
         * 返回参数
         * @param data
         * @return
         */
        ApiResultBeanBuilder data(JSONObject data);

        /**
         * 生成对象
         * @return
         */
        ApiResultBean build();
    }
}