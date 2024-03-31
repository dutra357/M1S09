package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.entity.LivroEntity;

import java.util.List;

public interface LivroService {

    LivroEntity criar(LivroEntity livro);

    List<LivroEntity> buscarTodos();

    LivroEntity buscarPorId(Long id);
    LivroEntity alterar(Long id, LivroEntity livro);

    void excluir(Long id);


}
