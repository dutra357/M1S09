package br.com.FullStack.M1S09.controller;

import br.com.FullStack.M1S09.entity.EmprestimosEntity;
import br.com.FullStack.M1S09.service.EmprestimoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class EmprestimoController {

    private final EmprestimoService service;

    public EmprestimoController(EmprestimoService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<List<EmprestimosEntity>> get(){
        return ResponseEntity.ok().body(service.buscarTodos());
    }
    @GetMapping("{id}")
    public ResponseEntity<EmprestimosEntity> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }



    @PostMapping //retornar 201, não 200
    public ResponseEntity<EmprestimosEntity> post(@RequestBody EmprestimosEntity emprestimo){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(emprestimo));
    }



    @PutMapping("{id}")
    public ResponseEntity<EmprestimosEntity> put(@PathVariable Long id, @RequestBody EmprestimosEntity emprestimo){
        return ResponseEntity.ok().body(service.alterar(id, emprestimo));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}