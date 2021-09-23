package br.com.martins.weliton.cleanarchitecture.gateway.repository.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "category", schema = "personal_finances")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryEntity {

    @Id
    @Column(name = "id_category")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_category")
    private String name;

    @Column(name = "type_category")
    private String type;
}
