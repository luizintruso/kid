package br.com.kid.repository;

import br.com.kid.domain.TipoEndereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnderecoRepository extends JpaRepository<TipoEndereco, Long> {
}
