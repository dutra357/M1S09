package br.com.FullStack.M1S09.controller;

import br.com.FullStack.M1S09.entity.VisitantesEntity;
import br.com.FullStack.M1S09.service.VisitanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("visitantes")
public class VisitanteController {

    private final VisitanteService service;

    public VisitanteController(VisitanteService service) {
        this.service = service;
    }



    @GetMapping
    public ResponseEntity<List<VisitantesEntity>> get(){
        return ResponseEntity.ok().body(service.buscarTodos());
    }
    @GetMapping("{id}")
    public ResponseEntity<VisitantesEntity> getId(@PathVariable Long id){
        return ResponseEntity.ok().body(service.buscarPorId(id));
    }



    @PostMapping //retornar 201, não 200
    public ResponseEntity<VisitantesEntity> post(@RequestBody VisitantesEntity visitante){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(visitante));
    }



    @PutMapping("{id}")
    public ResponseEntity<VisitantesEntity> put(@PathVariable Long id, @RequestBody VisitantesEntity visitante){
        return ResponseEntity.ok().body(service.alterar(id, visitante));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
