package br.com.kid.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "pessoafisica")
public class PessoaFisica {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idpessoa")
    private Pessoa pessoa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nomePai")
    private String nomePai;

    @Column(name = "nomeMae")
    private String nomeMae;

    @Column(name = "rg")
    private String rg;

    @Column(name = "rgorgaemissor") // TODO: arrumar nome no banco
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
