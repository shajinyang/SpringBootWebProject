package com.zx.app.entity;

import org.springframework.web.bind.annotation.RequestBody;

public class User {

    private int fId;
    private String fUserName;

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfUserName() {
        return fUserName;
    }

    public void setfUserName(String fUserName) {
        this.fUserName = fUserName;
    }
}
