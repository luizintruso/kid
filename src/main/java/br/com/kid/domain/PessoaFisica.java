package br.com.kid.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pessoafisica")
public class PessoaFisica extends Pessoa{

    @Column(name = "nomepai")
    private String nomePai;

    @Column(name = "nomemae")
    private String nomeMae;

    @Column(name = "rg")
    private String rg;

    @Column(name = "rgorgaoemissor") 
    private String rgOrgaoEmissor;

    @Column(name = "rguf")
    private String rgUf;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "datanascimento")
    private Date dataNascimento;

    @Column(name = "idade")
    private int idade;

    @Column(name = "codtiposexo")
    private int codTipoSexo;

    @Column(name = "codestadocivil")
    private int codEstadoCivil;

    @Column(name = "nacionalidade")
    private String nacionalidade;

    @Column(name = "naturalidade")
    private String naturalidade;

}
