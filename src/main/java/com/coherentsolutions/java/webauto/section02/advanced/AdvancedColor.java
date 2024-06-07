package com.coherentsolutions.java.webauto.section02.advanced;

/**
 * Enum representing color with additional methods.
 */
public enum AdvancedColor {
    BLACK("Black Color"),
    WHITE("White Color"),
    GRAY("Gray Color"),
    MULTICOLOR("Multicolor Color"),
    RED("Red Color");

    private String description;

    AdvancedColor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static AdvancedColor getColorByName(String name) {
        for (AdvancedColor color : AdvancedColor.values()) {
            if (color.name().equalsIgnoreCase(name)) {
                return color;
            }
        }
        throw new IllegalArgumentException("No color with name " + name + " found.");
    }

    public static void main(String[] args) {
        for (AdvancedColor color : AdvancedColor.values()) {
            System.out.println(color + ": " + color.getDescription());
        }

        System.out.println("Getting color by name 'red': " + AdvancedColor.getColorByName("red"));
    }
}
