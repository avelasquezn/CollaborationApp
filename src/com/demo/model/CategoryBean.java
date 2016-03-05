package com.demo.model;

import java.util.Date;

/**
 * Created by PT116-ORACLE on 05/03/2016.
 */
public class CategoryBean {
    private int code;
    private String name;
    private String description;
    private Date startDate;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
