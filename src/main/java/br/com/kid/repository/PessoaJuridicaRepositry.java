package br.com.kid.repository;

import br.com.kid.domain.PessoaJuridica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaJuridicaRepositry extends JpaRepository<PessoaJuridica, Long> {
}
