package com.qbhy.poster.kernal;

import com.qbhy.poster.contracts.Result;

import java.util.Map;

public class BlankResult extends JsonAble implements Result {
    private String code;
    private String msg;
    private Map<String, String> data;

    public BlankResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Map<String, String> getData() {
        return data;
    }

    public boolean isSuccessful() {
        return this.getCode().equals(Result.SUCCESSFUL);
    }

    /**
     * 获取 data 里面的字段
     * @param name
     * @return String
     */
    public String get(String name) {
        return data.get(name);
    }
}
