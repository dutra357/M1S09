package br.com.FullStack.M1S09.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;
import java.util.Objects;

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



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MembrosEntity that)) return false;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(nome, that.nome)) return false;
        if (!Objects.equals(endereco, that.endereco)) return false;
        return Objects.equals(telefone, that.telefone);
    }
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (endereco != null ? endereco.hashCode() : 0);
        result = 31 * result + (telefone != null ? telefone.hashCode() : 0);
        return result;
    }
}
