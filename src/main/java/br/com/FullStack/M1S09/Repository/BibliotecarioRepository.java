package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.BibliotecarioEntity;
import br.com.FullStack.M1S09.entity.LivroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BibliotecarioRepository extends JpaRepository<BibliotecarioEntity, Long> {
    @Query(value = "update bibliotecarios set " +
            " nome = :nome," +
            " email = :email, " +
            " senha = :senha " +
            " where id = :id",
            nativeQuery = true)
    BibliotecarioEntity update(@Param("id") Long id,
                               @Param("nome") String nome,
                               @Param("senha") String senha,
                               @Param("email") String email);
}
