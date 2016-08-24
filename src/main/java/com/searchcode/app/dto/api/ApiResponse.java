/*
 * Copyright (c) 2016 Boyter Online Services
 *
 * Use of this software is governed by the Fair Source License included
 * in the LICENSE.TXT file
 */


package com.searchcode.app.dto.api;


public class ApiResponse {
    private boolean sucessful;
    private String message;

    public ApiResponse() {}

    public ApiResponse(boolean sucessful, String message) {
        this.setSucessful(sucessful);
        this.setMessage(message);
    }

    public boolean isSucessful() {
        return sucessful;
    }

    public void setSucessful(boolean sucessful) {
        this.sucessful = sucessful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}