package jdc.springdev.recipeapp.repositories;

import jdc.springdev.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
