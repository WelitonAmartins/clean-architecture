package br.com.martins.weliton.cleanarchitecture.usecase.impl;

import br.com.martins.weliton.cleanarchitecture.domain.Category;
import br.com.martins.weliton.cleanarchitecture.usecase.ConsultAllCategory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import br.com.martins.weliton.cleanarchitecture.adapter.gateway.DBGateway;

import java.util.List;


@Component
@RequiredArgsConstructor
public class ConsultAllCategoryImpl implements ConsultAllCategory {

    @Autowired
    private final DBGateway dbGateway;

    @Override
    public List<Category> executar() {
        try {
            return this.dbGateway.consultAllCategory();
        }catch (RuntimeException e){
            throw  e;
        }
    }
}
