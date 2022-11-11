package com.tuling.vipspringboot.exception;

public class TulingException extends RuntimeException {

    private Integer code;
    private String mesg;

    public TulingException(Integer code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }
}
