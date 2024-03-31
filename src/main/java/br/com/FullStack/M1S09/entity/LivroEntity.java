package br.com.FullStack.M1S09.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "livros")
public class LivroEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 120)
    private String titulo;

    @Column(nullable = false, length = 20)
    private String autor;

    @Column(nullable = false)
    private Integer anoPublicacao;


}
