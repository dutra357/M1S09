package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.VisitantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitanteRepository extends JpaRepository<VisitantesEntity, Long> {

    @Query(value = "update visitante set " +
            " nome = :nome," +
            " telefone = :telefone, " +
            " where id = :id",
            nativeQuery = true

    )
    VisitantesEntity update(@Param("id") Long id,
                           @Param("nome") String titulo,
                           @Param("telefone") String autor);
}
