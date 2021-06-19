package br.com.kid.handler;

import br.com.kid.domain.infra.CamposInvalidos;
import br.com.kid.domain.infra.ProblemDetail;
import br.com.kid.domain.message.Message;
import br.com.kid.exception.DomainException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@ControllerAdvice
public class ConstraintViolationExceptionHandler {


    public static final String BAD_REQUEST = "Bad request";
    @Autowired
    MessageSource messageSource;

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<ProblemDetail> toProblemDetail(ConstraintViolationException exception, HttpServletRequest req) throws URISyntaxException {
        final String mensagem = messageSource.getMessage(Message.REQUISICAO_INVALIDA.getIdMensagem(), null, req.getLocale());
        List<CamposInvalidos> campos = exception.getConstraintViolations().stream().map(e -> {
            return CamposInvalidos.
                    builder().
                    name(e.getPropertyPath().toString()).
                    reason(e.getMessage()).
                    build();
        }).collect(Collectors.toList());
        final ProblemDetail detail = ProblemDetail.
                builder().
                title(BAD_REQUEST).
                detail(mensagem).
                status(HttpStatus.BAD_REQUEST.value()).
                type(new URI(req.getRequestURI())).
                instance(new URI(req.getRequestURI())).
                invalidParams(campos).
                build();

        return ResponseEntity.
                status(HttpStatus.BAD_REQUEST).contentType(MediaType.APPLICATION_JSON).body(detail);
    }

}
