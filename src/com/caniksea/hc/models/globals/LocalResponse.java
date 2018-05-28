package com.caniksea.hc.models.globals;

import java.io.Serializable;

public class LocalResponse implements Serializable {
    private String code, desc;
    private Object object;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public Object getObject() {
        return object;
    }
}
