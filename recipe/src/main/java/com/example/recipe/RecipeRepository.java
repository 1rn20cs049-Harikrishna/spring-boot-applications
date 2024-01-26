package com.example.recipe;

import java.util.ArrayList;

public interface RecipeRepository {
    ArrayList<Recipe> getRecipes();

    Recipe addRecipe(Recipe recipe);

    Recipe getRecipeById(int recipeId);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipeById(int recipeId);

}