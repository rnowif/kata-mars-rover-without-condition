package com.nrhumla.mars;

public enum Orientation {
    NORTH("EAST", "WEST"),
    SOUTH("WEST", "EAST"),
    EAST("SOUTH", "NORTH"),
    WEST("NORTH", "SOUTH");

    private final String right;
    private final String left;

    Orientation(String right, String left) {
        this.right = right;
        this.left = left;
    }

    public Orientation right() {
        return Orientation.valueOf(right);
    }

    public Orientation left() {
        return Orientation.valueOf(left);
    }
}
