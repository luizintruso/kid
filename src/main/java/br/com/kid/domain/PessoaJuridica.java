package br.com.kid.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "pessoajuridica")
public class PessoaJuridica {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idpessoa")
    private Pessoa pessoa;

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

    @Column(name = "numregsitrorepresentacao")//TODO: Arrumar nome banco
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
