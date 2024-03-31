package br.com.FullStack.M1S09.controller;

import br.com.FullStack.M1S09.entity.LivroEntity;
import br.com.FullStack.M1S09.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("membros")
public class BibliotecariosController {

    private final LivroService service;

    public BibliotecariosController(MembrosService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<List<LivroEntity>> get(){
        return ResponseEntity.ok().body(service.buscarTodos());
    }
    @GetMapping("{id}")
    public ResponseEntity<LivroEntity> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }



    @PostMapping //retornar 201, não 200
    public ResponseEntity<LivroEntity> post(@RequestBody LivroEntity livro){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(livro));
    }



    @PutMapping("{id}")
    public ResponseEntity<LivroEntity> put(@PathVariable Long id, @RequestBody LivroEntity livro){
        return ResponseEntity.ok().body(service.alterar(id, livro));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}







/*

<dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.4.0</version>
        </dependency>

springdoc.swagger-ui.use-root-path=true
 */