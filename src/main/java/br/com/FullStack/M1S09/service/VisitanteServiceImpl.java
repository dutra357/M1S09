package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.Repository.LivroRepository;
import br.com.FullStack.M1S09.Repository.VisitanteRepository;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.entity.VisitantesEntity;
import br.com.FullStack.M1S09.erro.NotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisitanteServiceImpl implements VisitanteService{

    private final VisitanteRepository repository;

    public VisitanteServiceImpl(VisitanteRepository repository) {
        this.repository = repository;
    }

    @Override
    public VisitantesEntity criar(VisitantesEntity visitante) {
        visitante.setId(null);
        return repository.save(visitante);
    }

    @Override
    public List<VisitantesEntity> buscarTodos() {
        return repository.findAll();
    }

    @Override
    public VisitantesEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Visitante não encontrado"));
    }

    @Override
    public VisitantesEntity alterar(Long id, VisitantesEntity visitante) {
        buscarPorId(id);
        visitante.setId(null);
        return repository.save(visitante);
    }

    @Override
    public void excluir(Long id) {
        var visitanteDeletado = buscarPorId(id);
        repository.delete(visitanteDeletado);
    }
}
