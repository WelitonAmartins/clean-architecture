package br.com.martins.weliton.cleanarchitecture.controller.mapper;

import org.mapstruct.Mapper;
import br.com.martins.weliton.cleanarchitecture.controller.data.response.CategoryResponse;
import br.com.martins.weliton.cleanarchitecture.domain.Category;

import java.util.List;

@Mapper(componentModel="spring")
public interface CategoryMapperResponse {

    List<CategoryResponse> mapperListDomainForResponseData(List<Category> category);
}
