package com.ar.globallogic.CarreraDemo.error;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseJson {
    @JsonProperty
    private String message;
    @JsonProperty
    private String status_code;
    @JsonProperty
    private String uri;
    
    
    
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getStatus_code() {
        return status_code;
    }
    public void setStatus_code(String status_code) {
        this.status_code = status_code;
    }
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public ResponseJson(String message, String status_code, String uri) {
        super();
        this.message = message;
        this.status_code = status_code;
        this.uri = uri;
    }
    public ResponseJson() {
        super();
    }
    
}
