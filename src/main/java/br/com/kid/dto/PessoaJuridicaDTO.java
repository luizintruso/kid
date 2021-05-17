package br.com.kid.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class PessoaJuridicaDTO extends PessoaDTO{

    private String nomeContratoSocial;
    private String nomeFantasia;
    private Float valorCapitalSocial;
    private String numInscricaoEstadual;
    private String numRegistroJuntaComercial;
    private LocalDate dataRegistroJuntaComercial;
    private String numUltimaAlteracaoContratoSocial;
    private LocalDate dataUltimaAlteracaoContratoSocial;
    private String numRegistroRepresentacao;
    private LocalDate dataRegistroRepresentacao;
    private String contratoSocial;
    private String numInscricaoMunicipal;
    private int codNacionalidade;
    private Boolean bolMei;

}
