package com.deppon.mbi.agile.core.domain.sys;

/**
 * Created by sunyamorn on 1/27/16.
 *
 * Uniform json response format.
 */
public class ResponseEntity<T> {
    private ResponseMsgStatus status;

    private String message;

    private T data;

    public ResponseEntity(){}

    public ResponseEntity(ResponseMsgStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseMsgStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseMsgStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
