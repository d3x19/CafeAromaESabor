package sp.senai.br.cafe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.senai.br.cafe.Model.Produto;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContainingIgnoreCase(String nomeParcial);
}