package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;

import java.util.List;

public interface MembroService {

    MembrosEntity criar(MembrosEntity membro);

    List<MembrosEntity> buscarTodos();

    MembrosEntity buscarPorId(Long id);
    MembrosEntity alterar(Long id, MembrosEntity membro);

    void excluir(Long id);


}
