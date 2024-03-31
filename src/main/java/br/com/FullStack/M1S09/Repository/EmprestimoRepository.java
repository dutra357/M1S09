package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.EmprestimosEntity;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimosEntity, Long> {
    @Query(value = "update emprestimos set " +
            " livro_id = :livroId," +
            " membro_id = :membroId, " +
            " dataEmprestimo = :dataEmprestimo " +
            " dataDevolucao = :dataDevolucao " +
            " where id = :id",

            nativeQuery = true)

    EmprestimosEntity update(@Param("id") Long id,
                             @Param("livroId") LivroEntity livroId,
                             @Param("membroId") MembrosEntity membroId,

                             @Param("dataEmprestimo") Date dataEmprestimo,
                             @Param("dataDevolucao") Date dataDevolucao);
}

