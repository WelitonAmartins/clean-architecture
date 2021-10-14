package br.com.martins.weliton.cleanarchitecture.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DefaultResponseEnvelope<T> {
    private Boolean success;
    private T result;

}
