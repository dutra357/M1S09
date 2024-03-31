package br.com.FullStack.M1S09.service;

import br.com.FullStack.M1S09.Repository.EmprestimoRepository;
import br.com.FullStack.M1S09.Repository.LivroRepository;
import br.com.FullStack.M1S09.entity.EmprestimosEntity;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.erro.NotFound;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmprestimoServiceImpl implements EmprestimoService{

    private final EmprestimoRepository repository;

    public EmprestimoServiceImpl(EmprestimoRepository repository) {
        this.repository = repository;
    }

    @Override
    public EmprestimosEntity criar(EmprestimosEntity emprestimo) {
        emprestimo.setId(null);
        return repository.save(emprestimo);
    }


    //Retorno em ordem por nome - By SORT Parameter
    @Override
    public List<EmprestimosEntity> buscarTodos() {
        return repository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }


    @Override
    public EmprestimosEntity buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new NotFound("Empréstimo não encontrado!"));
    }

    @Override
    public EmprestimosEntity alterar(Long id, EmprestimosEntity emprestimo) {
        buscarPorId(id);
        emprestimo.setId(null);
        return repository.save(emprestimo);
    }

    @Override
    public void excluir(Long id) {
        var deletado = buscarPorId(id);
        repository.delete(deletado);
    }
}
