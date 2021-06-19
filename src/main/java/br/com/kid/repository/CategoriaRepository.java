package br.com.kid.repository;

import br.com.kid.domain.Categoria;
import br.com.kid.dto.CategoriaDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Short> {
    Page<Categoria> findByCategoriaPai(Categoria categoria, Pageable pageable);
}
