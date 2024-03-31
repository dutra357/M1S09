package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<MembrosEntity, Long> {
    @Query(nativeQuery = true, value = "update membros set " +
            " nome = :nome," +
            " endereco = :endereco, " +
            " telefone = :telefone " +
            " where id = :id")
    MembrosEntity update(@Param("id") Long id,
                        @Param("nome") String nome,
                        @Param("endereco") String endereco,
                        @Param("telefone") String telefone);
}
