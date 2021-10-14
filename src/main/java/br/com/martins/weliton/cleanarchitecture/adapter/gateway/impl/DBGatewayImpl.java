package br.com.martins.weliton.cleanarchitecture.adapter.gateway.impl;

import br.com.martins.weliton.cleanarchitecture.domain.Category;
import br.com.martins.weliton.cleanarchitecture.adapter.mapper.CategoryMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.martins.weliton.cleanarchitecture.adapter.gateway.DBGateway;
import br.com.martins.weliton.cleanarchitecture.adapter.database.repository.CategoryRepository;

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
