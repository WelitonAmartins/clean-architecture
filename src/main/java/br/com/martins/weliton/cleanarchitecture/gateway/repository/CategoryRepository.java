package br.com.martins.weliton.cleanarchitecture.gateway.repository;

import br.com.martins.weliton.cleanarchitecture.gateway.repository.data.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
