package com.test.start.model;

public enum BlogType {
    VALID(1),
    INVALID(2);
    private int type;
    private BlogType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }
}
