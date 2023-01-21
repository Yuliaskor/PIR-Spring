package com.example.PiRSpring.security;

public enum ApplicationUserPermission {
    ALL("write:read");
    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
