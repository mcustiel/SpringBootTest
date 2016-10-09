package org.mcustiel.testbootstrap.converters;

import org.mcustiel.testbootstrap.domain.Category;
import org.mcustiel.testbootstrap.input.CategoryResource;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryResourceConverter implements
	Converter<Category, CategoryResource> {

    @Override
    public CategoryResource convert(Category category) {
	return CategoryResource.builder().withColor(category.getColor())
		.withDashboardId(category.getDashboard().getId().getValue())
		.withHidden(category.getHidden())
		.withName(category.getName())
		.withPosition(category.getPosition())
		.withSide(category.getSide())
		.build();
    }
}
