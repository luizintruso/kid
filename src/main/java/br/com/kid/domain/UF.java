package br.com.kid.domain;

import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Data
@Entity
@Table(name = "uf")
public class UF {

    @Id
    @Column(name="id", insertable=true, updatable=true, unique=true, nullable=false)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

}
