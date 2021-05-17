package br.com.kid.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "codtipoendereco")
    private TipoEndereco tipoEndereco;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "iduf")
    private UF uf;

    @OneToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "idpessoa")
    private Pessoa pessoa;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "cidade")
    private String cidade;

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

}
