package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.entity.EmprestimosEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;

import java.util.List;

public interface EmprestimoService {

    EmprestimosEntity criar(EmprestimosEntity emprestimo);

    List<EmprestimosEntity> buscarTodos();

    EmprestimosEntity buscarPorId(Long id);
    EmprestimosEntity alterar(Long id, EmprestimosEntity emprestimo);

    void excluir(Long id);


}
