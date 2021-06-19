package br.com.kid.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @Column(name = "id", insertable = true, updatable = true, unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    @NotNull
    @Column(name = "nome", nullable = false)
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcategoriapai")
    private Categoria categoriaPai;
    @NotNull
    @Column(name = "sigla", nullable = false)
    private String sigla;
}
