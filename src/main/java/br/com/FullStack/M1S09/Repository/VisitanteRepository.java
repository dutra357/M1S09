package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.VisitantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<VisitantesEntity, Long> {
}
