package com.deppon.mbi.agile.core.domain.sys;

/**
 * Created by sunyamorn on 1/27/16.
 */
public enum ResponseMsgStatus {
    OK,
    ERROR;

    @Override
    public String toString() {
        String retVal;
        switch (this) {
            case OK:
                retVal = "ok";
                break;
            case ERROR:
                retVal = "error";
                break;
            default:
                retVal = "ok";

        }
        return retVal;
    }
}
