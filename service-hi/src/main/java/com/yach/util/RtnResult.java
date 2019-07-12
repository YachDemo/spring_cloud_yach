package com.yach.util;

import java.io.Serializable;

/**
 * 封装的返回值
 * Created by Yach on 2019/7/11
 * @version v1.0
 */
public class RtnResult implements Serializable {
    /**
     * 返回状态
     */
    private boolean result;
    /**
     * 状态码
     */
    private String code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据对象
     */
    private Object data;
    /**
     * 数据条数
     */
    private Integer totals;

    /**
     * 无参构造
     */
    public RtnResult() { }

    public RtnResult(boolean result, String code, String message) {
        this.result = result;
        this.code = code;
        this.message = message;
    }

    public RtnResult(boolean result, String code, String message, Object data) {
        this.result = result;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RtnResult(boolean result, String code, String message, Object data, Integer totals) {
        this.result = result;
        this.code = code;
        this.message = message;
        this.data = data;
        this.totals = totals;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public Integer getTotals() {
        return totals;
    }

    public void setTotals(Integer totals) {
        this.totals = totals;
    }
}
