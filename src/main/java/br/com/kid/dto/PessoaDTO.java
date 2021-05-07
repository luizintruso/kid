package br.com.kid.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.Data;

@Data
@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "codTipoPessoa")
		@JsonSubTypes({ 
		  @Type(value = PessoaFisicaDTO.class, name = "1"), 
		  @Type(value = PessoaJuridicaDTO.class, name = "2") 
		})
public class PessoaDTO {

    private Long id;
//    private int codTipoPessoa;
    private String nome;
    private String email;
    private String numCpfCnpj;
    private String dddTelefone;
    private String telefone;
    private String dddCelular;
    private String celular;
    private LocalDateTime dataHoraInicio;
    private EnderecoDTO endereco;
    
}
