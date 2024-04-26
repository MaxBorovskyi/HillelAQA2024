package org.example.HW9;

public enum Size {
    S("S", 50, 60),
    M("M", 60, 70),
    XL("XL", 70, 80),
    XXL("XXL", 80, 90);

    private String shortName;
    private int width;
    private int length;

    Size (String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }
    public int getWidth(){
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Size: " + shortName + ", Width: " + width + ", Length: " + length;
    }
}
