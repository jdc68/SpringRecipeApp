package jdc.springdev.recipeapp.controllers;

import jdc.springdev.recipeapp.domain.Category;
import jdc.springdev.recipeapp.domain.UnitOfMeasure;
import jdc.springdev.recipeapp.repositories.CategoryRepository;
import jdc.springdev.recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is " + categoryOptional.get().getId());
        System.out.println("UOM Id is " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}
