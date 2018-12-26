package com.example.importexcel.Entity;

import java.io.Serializable;
import java.util.List;

public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = -5127145149438726874L;
    public static final String SUCCESS = "1";
    public static final String FAILURE = "0";
    public static final String DATA_NOT_FOUND = "2";
    public static final String NOLOGIN = "0";
    public static final String NORMAL = "1";
    public static final String NOAUTH = "2";
    public static final String SUCCESS_CODE = "000000";
    public static final String SUCCESS_MESSAGE = "操作成功";
    public static final String FAILURE_CODE = "000000";
    public static final String FAILURE_MESSAGE = "操作失败";
    public static final String DATA_NOT_FOUND_CODE = "000000";
    public static final String DATA_NOT_FOUND_MESSAGE = "数据不存在";
    public static final String PARAMETERS_EMPTY_CODE = "000000";
    public static final String PARAMETERS_EMPTY_MESSAGE = "参数不能为空";
    public static final String PARAMETERS_ERROR_CODE = "000000";
    public static final String PARAMETERS_ERROR_MESSAGE = "传入参数错误";
    private String status;
    private String result;
    private Object data;
    private String code;
    private String message;

    public JsonResult() {
    }

    public JsonResult(boolean result) {
        this.status = "1";
        if (result) {
            this.result = "1";
            this.code = "000000";
            this.message = "操作成功";
        } else {
            this.result = "0";
            this.code = "000000";
            this.message = "操作失败";
        }

    }

    public JsonResult(boolean result, T model) {
        this.status = "1";
        if (result) {
            this.result = "1";
            this.data = model;
            this.code = "000000";
            this.message = "操作成功";
        } else {
            this.result = "0";
            this.code = "000000";
            this.message = "操作失败";
        }

    }

    public JsonResult(T model) {
        this.status = "1";
        if (model != null) {
            this.result = "1";
            this.data = model;
            this.code = "000000";
            this.message = "操作成功";
        } else {
            this.result = "2";
            this.code = "000000";
            this.message = "数据不存在";
        }

    }

    public JsonResult(List<T> list) {
        this.status = "1";
        if (list != null && list.size() > 0) {
            this.result = "1";
            this.data = list;
            this.code = "000000";
            this.message = "操作成功";
        } else {
            this.result = "2";
            this.code = "000000";
            this.message = "数据不存在";
        }

    }


    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Object getData() {
        return this.data == null ? "" : this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
