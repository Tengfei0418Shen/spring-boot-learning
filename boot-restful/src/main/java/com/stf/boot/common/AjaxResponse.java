package com.stf.boot.common;

/**
 * @program: boot-learning
 * @description:
 * @author: ShenTF
 * @create: 2022-03-10 16:40:00
 **/

public class AjaxResponse {
    private Integer code;
    private String message;
    private Object data;

    private AjaxResponse() {
    }

    /**
     * 请求成功的响应:不带查询参数（删除、修改、新增的接口）
     *
     * @return AjaxResponse
     */
    public static AjaxResponse success() {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");

        return ajaxResponse;
    }

    /**
     * 请求成功的响应:带返回数据
     *
     * @param data 返回数据
     * @return AjaxResponse
     */
    public static AjaxResponse success(Object data) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求成功");
        ajaxResponse.setData(data);

        return ajaxResponse;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
