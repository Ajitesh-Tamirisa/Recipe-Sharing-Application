package com.project.recipe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe_allergy_info")
@IdClass(RecipeAllergyInfoId.class)
public class RecipeAllergyInfo {

    @Id
    @Column(name = "recipe_id")
    private Long recipeId;

    @Id
    @Column(name = "allergen_id")
    private Long allergenId;

    // Constructors

    public RecipeAllergyInfo() {
    }

    public RecipeAllergyInfo(Long recipeId, Long allergenId) {
        this.recipeId = recipeId;
        this.allergenId = allergenId;
    }

    // Getters and Setters

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public Long getAllergenId() {
        return allergenId;
    }

    public void setAllergenId(Long allergenId) {
        this.allergenId = allergenId;
    }
}
