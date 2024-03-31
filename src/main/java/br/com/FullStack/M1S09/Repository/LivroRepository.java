package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<LivroEntity, Long> {
}
