package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.BibliotecarioEntity;
import br.com.FullStack.M1S09.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
}
