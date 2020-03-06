package com.slx.boot.mzproject.bean;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;
    private Long totalPage;
}
