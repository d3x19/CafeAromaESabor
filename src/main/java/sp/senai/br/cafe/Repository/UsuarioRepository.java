package sp.senai.br.cafe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sp.senai.br.cafe.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}