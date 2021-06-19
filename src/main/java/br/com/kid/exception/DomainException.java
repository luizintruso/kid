package br.com.kid.exception;

import br.com.kid.domain.message.Message;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class DomainException extends Exception {
    private Object[] parameters;
    private HttpStatus status;

    public DomainException() {
        status = HttpStatus.BAD_REQUEST;
    }

    public DomainException(String message) {
        super(message);
        status = HttpStatus.BAD_REQUEST;
        this.parameters = parameters;
    }

    public DomainException(Message message) {
        super(message.getIdMensagem());
        status = HttpStatus.BAD_REQUEST;
        this.parameters = parameters;
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
        status = HttpStatus.BAD_REQUEST;
    }

    public DomainException(Throwable cause) {
        super(cause);
        status = HttpStatus.BAD_REQUEST;
    }

    public DomainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        status = HttpStatus.BAD_REQUEST;
    }
}
