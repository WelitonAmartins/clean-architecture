package br.com.martins.weliton.cleanarchitecture.domain;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {

    private Long id;
    private String name;
    private String type;
}
