package br.com.kid.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codtipoendereco")
    private TipoEndereco tipoEndereco;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idUf")
    private UF uf;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idpessoa")
    private Pessoa pessoa;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "descendereco")
    private String descEndereco;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "desccomplemento")
    private String descComplemento;

    @Column(name = "datahorainicio")
    private Date dataHoraInicio;

    @Column(name = "dddtelefone")
    private String dddTelefone;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "dddcelular")
    private String dddCelular;

   // @Column(name = "celular") -- TODO: arrumar no banco o tipo
    //private String celular;

}
