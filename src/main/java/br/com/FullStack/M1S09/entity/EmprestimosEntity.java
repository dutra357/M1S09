package br.com.FullStack.M1S09.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "emprestimos")
public class EmprestimosEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @Column(name = "livro_id", nullable = false)
    private List<LivroEntity> livro;

    @ManyToOne
    @Column(name = "membro_id", nullable = false)
    private MembrosEntity membro;



    @Column(name = "data_emprestimo", nullable = false)
    private LocalDate dataEmprestimo = LocalDate.now();

    @Column(name = "data_devolucao", nullable = false)
    private LocalDate dataDevolucao;


}
