package org.mcustiel.testbootstrap.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.inject.Inject;
import javax.xml.ws.http.HTTPException;

import org.mcustiel.testbootstrap.domain.Category;
import org.mcustiel.testbootstrap.domain.ids.CategoryId;
import org.mcustiel.testbootstrap.input.CategoryResource;
import org.mcustiel.testbootstrap.services.CategoryService;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category", consumes = { "application/hal+json",
	"application/vnd.booky-v1+json" }, produces = { "application/hal+json" })
public class CategoryController {
    @Inject
    private CategoryService categoryService;
    @Inject
    private ConversionService conversionService;

    public CategoryController(CategoryService categoryService,
	    ConversionService conversionService) {
	this.categoryService = categoryService;
	this.conversionService = conversionService;
    }

    @RequestMapping(value = "/{categoryId}", method = GET)
    public ResponseEntity<CategoryResource> getCategoryById(
	    @PathVariable Integer categoryId) {
	try {
	    return new ResponseEntity<CategoryResource>(
		    conversionService.convert(
			    categoryService.getById(new CategoryId(categoryId)),
			    CategoryResource.class), HttpStatus.OK);
	} catch (Exception e) {
	    throw new HTTPException(HttpStatus.INTERNAL_SERVER_ERROR.value());
	}
    }

    @RequestMapping(method = POST)
    public ResponseEntity<CategoryResource> createCategory(
	    CategoryResource categoryResource) {
	Category category = categoryService.createCategory(conversionService
		.convert(categoryResource, Category.class));
	categoryResource.setId(category.getId().getValue());
	return new ResponseEntity<CategoryResource>(categoryResource,
		HttpStatus.CREATED);
    }
}
