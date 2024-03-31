package br.com.FullStack.M1S09.controller;

import br.com.FullStack.M1S09.entity.BibliotecarioEntity;
import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.service.BibliotecarioService;
import br.com.FullStack.M1S09.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class BibliotecarioController {

    private final BibliotecarioService service;

    public BibliotecarioController(BibliotecarioService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<List<BibliotecarioEntity>> get(){
        return ResponseEntity.ok().body(service.buscarTodos());
    }
    @GetMapping("{id}")
    public ResponseEntity<BibliotecarioEntity> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }



    @PostMapping //retornar 201, não 200
    public ResponseEntity<BibliotecarioEntity> post(@RequestBody BibliotecarioEntity bibliotecario){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(bibliotecario));
    }



    @PutMapping("{id}")
    public ResponseEntity<BibliotecarioEntity> put(@PathVariable Long id, @RequestBody BibliotecarioEntity bibliotecario){
        return ResponseEntity.ok().body(service.alterar(id, bibliotecario));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}