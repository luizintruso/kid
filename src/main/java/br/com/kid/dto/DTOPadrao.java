package br.com.kid.dto;

import java.io.Serializable;

public interface DTOPadrao<T extends Serializable> extends Serializable {
    T getId();
}
