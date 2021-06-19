package br.com.kid.domain.infra;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.net.URI;
import java.util.List;

@Data
@Builder
public class ProblemDetail {

    private URI type;
    private String title;
    private String detail;
    private Integer status;
    private URI instance;
    @JsonProperty("invalid-params")
    private List<CamposInvalidos> invalidParams;
}