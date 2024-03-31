package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.entity.BibliotecarioEntity;
import br.com.FullStack.M1S09.entity.VisitantesEntity;

import java.util.List;

public interface BibliotecarioService {

    BibliotecarioEntity criar(BibliotecarioEntity bibliotecario);

    List<BibliotecarioEntity> buscarTodos();

    BibliotecarioEntity buscarPorId(Long id);
    BibliotecarioEntity alterar(Long id, BibliotecarioEntity bibliotecario);

    void excluir(Long id);


}
