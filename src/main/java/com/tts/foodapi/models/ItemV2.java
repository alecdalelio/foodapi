package com.tts.foodapi.models;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class ItemV2 {
    
    @ApiModelProperty(notes = "The name of the menu item")
    private String name;

    @ApiModelProperty(notes = "The description of the menu item")
    private String description;

    @ApiModelProperty(notes = "The category of the menu item(app, entree, dessert, etc.")
    private String category;

    @ApiModelProperty(notes = "The ingredients used in the menu item")
    private List<IngredientV2> ingredients;

    @ApiModelProperty(notes = "The price of the menu item")
    private double price;

    @ApiModelProperty(notes = "The creation date of the menu item")
    private Date createdDate;

    @ApiModelProperty(notes = "The last updated date of the menu item")
    private Date updatedDate;

    private boolean glutenFree;

    private boolean vegan;

    public ItemV2() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<IngredientV2> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientV2> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public String toString() {
        return "Item [category=" + category + ", createdDate=" + createdDate + ", description=" + description
                + ", ingredients=" + ingredients + ", name=" + name + ", price=" + price + ", updatedDate="
                + updatedDate + "]";
    }

}
