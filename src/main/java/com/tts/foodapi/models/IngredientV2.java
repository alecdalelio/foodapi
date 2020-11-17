package com.tts.foodapi.models;

public class IngredientV2 {
  
    private String name;
    private String category;
    private String origin;
    private String isMeat;

    public IngredientV2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getIsMeat() {
        return isMeat;
    }

    public void setIsMeat(String isMeat) {
        this.isMeat = isMeat;
    }

    @Override
    public String toString() {
        return "IngredientV2 [category=" + category + ", isMeat=" + isMeat + ", name=" + name + ", origin=" + origin
                + "]";
    }

}
