package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.VisitantesEntity;

import java.util.List;

public interface VisitanteService {

    VisitantesEntity criar(VisitantesEntity visitante);

    List<VisitantesEntity> buscarTodos();

    VisitantesEntity buscarPorId(Long id);
    VisitantesEntity alterar(Long id, VisitantesEntity visitante);

    void excluir(Long id);


}
