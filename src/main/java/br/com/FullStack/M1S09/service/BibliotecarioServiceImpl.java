package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.Repository.BibliotecarioRepository;
import br.com.FullStack.M1S09.Repository.MembroRepository;
import br.com.FullStack.M1S09.entity.BibliotecarioEntity;
import br.com.FullStack.M1S09.entity.MembrosEntity;
import br.com.FullStack.M1S09.erro.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BibliotecarioServiceImpl implements BibliotecarioService{

    private final BibliotecarioRepository repository;

    public BibliotecarioServiceImpl(BibliotecarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public BibliotecarioEntity criar(BibliotecarioEntity bibliotecario) {
        bibliotecario.setId(null);
        return repository.save(bibliotecario);
    }

    @Override
    public List<BibliotecarioEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public BibliotecarioEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Bibliotecário não encontrado!"));
    }

    @Override
    public BibliotecarioEntity alterar(Long id, BibliotecarioEntity membro) {
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
