package com.example.demo.utils;

public class VersionHolder {

    public static final ThreadLocal<String> version;

    private VersionHolder() {
        throw new IllegalStateException("Utility class");
    }

    static {
        version = new ThreadLocal<>();
    }
}
