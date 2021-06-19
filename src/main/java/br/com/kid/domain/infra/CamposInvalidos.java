package br.com.kid.domain.infra;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CamposInvalidos {
    private String name;
    private String reason;
}
