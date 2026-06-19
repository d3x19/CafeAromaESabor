package sp.senai.br.cafe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.senai.br.cafe.Model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}