package br.com.kid.domain.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {
    ENTIDADE_NAO_ENCONTRADA("msg.error.001"),
    REQUISICAO_INVALIDA("msg.error.002");
    private String idMensagem;
}
