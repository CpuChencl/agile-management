package com.deppon.mbi.agile.core.context;

/**
 * Created by sunyamorn on 1/27/16.
 */
public enum UserRole {
    ROLE_ROOT(0), // Super user
    ROLE_ADMIN(1),
    ROLE_USER(2);

    private int value;

    UserRole(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
