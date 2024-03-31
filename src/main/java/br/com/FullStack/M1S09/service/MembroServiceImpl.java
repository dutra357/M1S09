package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.Repository.LivroRepository;
import br.com.FullStack.M1S09.Repository.MembroRepository;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;
import br.com.FullStack.M1S09.erro.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroServiceImpl implements MembroService{

    private final MembroRepository repository;

    public MembroServiceImpl(MembroRepository repository) {
        this.repository = repository;
    }

    @Override
    public MembrosEntity criar(MembrosEntity membro) {
        membro.setId(null);
        return repository.save(membro);
    }

    @Override
    public List<MembrosEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public MembrosEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Membro não encontrado!"));
    }

    @Override
    public MembrosEntity alterar(Long id, MembrosEntity membro) {
        buscarPorId(id);
        membro.setId(null);
        return repository.save(membro);
    }

    @Override
    public void excluir(Long id) {
        var deletado = buscarPorId(id);
        repository.delete(deletado);
    }
}
