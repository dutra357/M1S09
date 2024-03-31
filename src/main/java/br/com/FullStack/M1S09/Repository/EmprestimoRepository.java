package br.com.FullStack.M1S09.Repository;

import br.com.FullStack.M1S09.entity.EmprestimosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<EmprestimosEntity, Long> {
}
