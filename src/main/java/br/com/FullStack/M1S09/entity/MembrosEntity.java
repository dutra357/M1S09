package br.com.FullStack.M1S09.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table (name = "membros")
public class MembrosEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 200)
    private String endereco;

    @Column(nullable = false, length = 20)
    private String telefone;


}
