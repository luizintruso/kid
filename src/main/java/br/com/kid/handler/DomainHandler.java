package br.com.kid.handler;

import br.com.kid.domain.infra.ProblemDetail;
import br.com.kid.exception.DomainException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;

@Slf4j
@ControllerAdvice
public class DomainHandler {

    public static final String BAD_REQUEST = "Bad request";
    @Autowired
    MessageSource messageSource;

    @ExceptionHandler(DomainException.class)
    public ResponseEntity<ProblemDetail> toProblemDetail(DomainException exception, HttpServletRequest req) throws URISyntaxException {
        final String mensagem = messageSource.getMessage(exception.getMessage(), exception.getParameters(), req.getLocale());
        final ProblemDetail detail = ProblemDetail.
                builder().
                detail(mensagem).
                status(exception.getStatus().value()).
                title(BAD_REQUEST).
                instance(new URI(req.getRequestURI())).

                build();

        return ResponseEntity.
                status(exception.getStatus().value()).contentType(MediaType.APPLICATION_JSON).body(detail);
    }
}
