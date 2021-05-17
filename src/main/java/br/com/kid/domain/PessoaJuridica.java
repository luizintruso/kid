package br.com.kid.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pessoajuridica")
public class PessoaJuridica extends Pessoa{

    @Column(name = "nomecontratosocial")
    private String nomeContratoSocial;

    @Column(name = "nomefantasia")
    private String nomeFantasia;

    @Column(name = "valorcapitalsocial")
    private Float valorCapitalSocial;

    @Column(name = "numinscricaoestadual")
    private String numInscricaoEstadual;

    @Column(name = "numregistrojuntacomercial")
    private String numRegistroJuntaComercial;

    @Column(name = "dataregistrojuntacomercial")
    private Date dataRegistroJuntaComercial;

    @Column(name = "numultimaalteracaocontratosocial")
    private String numUltimaAlteracaoContratoSocial;

    @Column(name = "dataultimaalteracaocontratosocial")
    private Date dataUltimaAlteracaoContratoSocial;

    @Column(name = "numregistrorepresentacao")
    private String numRegistroRepresentacao;

    @Column(name = "dataregistrorepresentacao")
    private Date dataRegistroRepresentacao;

    @Column(name = "contratosocial")
    private String contratoSocial;

    @Column(name = "numinscricaomunicipal")
    private String numInscricaoMunicipal;

    @Column(name = "codnacionalidade")
    private int codNacionalidade;

    @Column(name = "bolmei")
    private Boolean bolMei;

}
