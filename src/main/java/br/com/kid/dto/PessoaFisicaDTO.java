package br.com.kid.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class PessoaFisicaDTO extends PessoaDTO{

    private String nomePai;
    private String nomeMae;
    private String rg;
    private String rgOrgaoEmissor;
    private String rgUf;
    private String cpf;
    private LocalDate dataNascimento;
    private int idade;
    private int codTipoSexo;
    private int codEstadoCivil;
    private String nacionalidade;
    private String naturalidade;

}
