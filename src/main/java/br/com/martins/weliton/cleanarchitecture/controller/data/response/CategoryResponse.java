package br.com.martins.weliton.cleanarchitecture.controller.data.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryResponse {

    private Long id;
    private String name;
    private String type;
}
