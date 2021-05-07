package br.com.kid.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codtipopessoa")
    private int codTipoPessoa;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "numcpfcnpj")
    private String numCpfCnpj;
    
    @Column(name = "dddtelefone")
    private String dddTelefone;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "dddcelular")
    private String dddCelular;

    @Column(name = "celular") 
    private String celular;

    @Column(name = "datahorainicio")
    private Date dataHoraInicio;
    
    @OneToOne (cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pessoa")
    private Endereco endereco;

}
