package br.com.FullStack.M1S09.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@Table(name = "emprestimos")
public class EmprestimosEntity {
    @Id
    @GeneratedValue
    private Long id;


    @OneToMany
    @JoinColumn(name = "livro_id", nullable = false)
    private List<LivroEntity> livro;
    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private MembrosEntity membro;


    @Column(name = "data_emprestimo", nullable = false)
    private LocalDate dataEmprestimo = LocalDate.now();

    @Column(name = "data_devolucao", nullable = false)
    private LocalDate dataDevolucao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmprestimosEntity that)) return false;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(livro, that.livro)) return false;
        if (!Objects.equals(membro, that.membro)) return false;
        if (!Objects.equals(dataEmprestimo, that.dataEmprestimo))
            return false;
        return Objects.equals(dataDevolucao, that.dataDevolucao);
    }
    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (livro != null ? livro.hashCode() : 0);
        result = 31 * result + (membro != null ? membro.hashCode() : 0);
        result = 31 * result + (dataEmprestimo != null ? dataEmprestimo.hashCode() : 0);
        result = 31 * result + (dataDevolucao != null ? dataDevolucao.hashCode() : 0);
        return result;
    }
}
