package br.com.martins.weliton.cleanarchitecture.gateway.impl;

import br.com.martins.weliton.cleanarchitecture.domain.Category;
import br.com.martins.weliton.cleanarchitecture.gateway.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.martins.weliton.cleanarchitecture.gateway.DBGateway;
import br.com.martins.weliton.cleanarchitecture.gateway.repository.CategoryRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DBGatewayImpl implements DBGateway {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> consultAllCategory() {
        return categoryMapper.mapperListEntityForDomain(this.categoryRepository.findAll());
    }


}
