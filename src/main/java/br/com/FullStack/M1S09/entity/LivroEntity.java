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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LivroEntity that)) return false;

        return id.equals(that.id);
    }
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
