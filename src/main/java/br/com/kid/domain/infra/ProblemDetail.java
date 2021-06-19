package br.com.kid.domain.infra;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.MediaType;

import java.net.URI;

@Data
@Builder
public class ProblemDetail {

    private URI type;
    private String title;
    private String detail;
    private Integer status;
    private URI instance;
}