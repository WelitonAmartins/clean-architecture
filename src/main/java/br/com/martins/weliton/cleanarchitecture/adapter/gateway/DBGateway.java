package br.com.martins.weliton.cleanarchitecture.adapter.gateway;

import br.com.martins.weliton.cleanarchitecture.domain.Category;

import java.util.List;

public interface DBGateway {

    List<Category> consultAllCategory();

}
