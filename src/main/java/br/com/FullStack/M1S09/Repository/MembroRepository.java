package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembroRepository extends JpaRepository<MembrosEntity, Long> {
}
