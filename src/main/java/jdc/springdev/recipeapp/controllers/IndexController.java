package jdc.springdev.recipeapp.controllers;

import jdc.springdev.recipeapp.domain.Category;
import jdc.springdev.recipeapp.domain.UnitOfMeasure;
import jdc.springdev.recipeapp.repositories.CategoryRepository;
import jdc.springdev.recipeapp.repositories.UnitOfMeasureRepository;
import jdc.springdev.recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
