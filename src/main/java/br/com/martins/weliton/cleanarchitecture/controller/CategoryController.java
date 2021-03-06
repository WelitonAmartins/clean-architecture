package br.com.martins.weliton.cleanarchitecture.controller;

import br.com.martins.weliton.cleanarchitecture.controller.mapper.CategoryMapperResponse;
import br.com.martins.weliton.cleanarchitecture.usecase.ConsultAllCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.martins.weliton.cleanarchitecture.controller.dto.response.DefaultResponseEnvelope;

@RestController
@RequestMapping(value = "/category")
@RequiredArgsConstructor
public class CategoryController {

    private final ConsultAllCategory consultAllCategory;

    private final CategoryMapperResponse categoryMapperResponse;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public DefaultResponseEnvelope<Object> consultAllCategory(){
        return DefaultResponseEnvelope.builder().success(true).result(categoryMapperResponse.mapperListDomainForResponseData(this.consultAllCategory.executar())).build();

    }

}
