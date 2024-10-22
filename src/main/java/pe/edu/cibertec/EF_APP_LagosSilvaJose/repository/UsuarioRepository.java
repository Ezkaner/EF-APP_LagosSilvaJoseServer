package pe.edu.cibertec.EF_APP_LagosSilvaJose.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.EF_APP_LagosSilvaJose.model.Usuario;
import pe.edu.cibertec.EF_APP_LagosSilvaJose.repository.UsuarioRepository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCodigo(String codigo);

}