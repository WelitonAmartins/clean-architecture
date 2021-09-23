package br.com.martins.weliton.cleanarchitecture.usecase;


import br.com.martins.weliton.cleanarchitecture.domain.Category;

import java.util.List;

public interface ConsultAllCategory {
    List<Category> executar();
}
