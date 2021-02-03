package jdc.springdev.recipeapp.services;

import jdc.springdev.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
