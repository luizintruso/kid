package br.com.kid.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tipoendereco")
public class TipoEndereco {

    @Id
    @Column(name="codtipoendereco", insertable=true, updatable=true, unique=true, nullable=false)
    private int codTipoEndereco;

    @Column(name = "desctipoendereco")
    private String descTipoEndereco;

}
