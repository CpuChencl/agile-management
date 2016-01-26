package com.deppon.mbi.agile.core.domain.auth;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sunyamorn on 1/27/16.
 */
public class Function {

    private int id;

    private String name;

    private List<Function> functions = new LinkedList<>();
    /**
     * this field help to query sub function as a query condition
     */
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Function> getFunctions() {
        return functions;
    }

    public void setFunctions(List<Function> functions) {
        this.functions = functions;
    }
}
