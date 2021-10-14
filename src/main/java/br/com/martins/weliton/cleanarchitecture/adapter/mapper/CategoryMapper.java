package br.com.martins.weliton.cleanarchitecture.adapter.mapper;

import org.mapstruct.Mapper;
import br.com.martins.weliton.cleanarchitecture.domain.Category;
import br.com.martins.weliton.cleanarchitecture.adapter.database.entity.CategoryEntity;

import java.util.List;

@Mapper(componentModel="spring")
public interface CategoryMapper {

    List<Category> mapperListEntityForDomain(List<CategoryEntity> categoryEntity);

}
