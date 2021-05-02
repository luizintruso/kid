package br.com.kid.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @Column(name = "codtipopessoa")
    private int codTipoPessoa;

    @Column(name = "numcpfcnpj")
    private String numCpfCnpj;

    @Column(name = "dataHorainicio")
    private Date dataHoraInicio;

}
