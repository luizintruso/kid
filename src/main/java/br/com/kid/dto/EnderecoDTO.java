package br.com.kid.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EnderecoDTO {

    private Long id;

    private Long codTipoEndereco;
    private Long idUf;
    private Long idPessoa;

    private Integer cep;
    private String cidade;
    private String sigla;
    private String bairro;
    private String descEndereco;
    private Integer numero;
    private String descComplemento;
    private LocalDate dataHoraInicio;
    private String dddTelefone;
    private String telefone;
    private String dddCelular;
    private String celular;

}