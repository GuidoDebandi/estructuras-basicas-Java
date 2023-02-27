package com.example.demo.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum MsAuthResponseCode {

    OK(1);
    @JsonValue
    public final Integer label;

    private static final Map<String, MsAuthResponseCode> BY_LABEL = new HashMap<>();


    static {
        for (MsAuthResponseCode e : values()) {
            BY_LABEL.put(e.label.toString(), e);
        }
    }

    MsAuthResponseCode( Integer label) {
        this.label = label;
    }



    public static MsAuthResponseCode valueOfLabel(Integer label) {
        return BY_LABEL.get(label.toString());
    }

    }
