package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.Repository.LivroRepository;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.erro.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroServiceImpl implements LivroService{

    private final LivroRepository repository;

    public LivroServiceImpl(LivroRepository repository) {
        this.repository = repository;
    }

    @Override
    public LivroEntity criar(LivroEntity livro) {
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public List<LivroEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public LivroEntity buscarPorId(Long id) {
        return repository.findBy().orElseThrow(() -> new NotFound("Livro não encontrado"));
    }

    @Override
    public LivroEntity alterar(Long id, LivroEntity livro) {
        buscarPorId(id);
        entity.setId(null);
        return repository.save(entity);
    }

    @Override
    public void excluir(Long id) {
        buscarPorId(id);
        return repository.delete();
    }
}
