package br.com.martins.weliton.cleanarchitecture.adapter.database.repository;

import br.com.martins.weliton.cleanarchitecture.adapter.database.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
