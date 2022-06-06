package eng.valdinilson.domain.aluno;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {
    public enum Sexo {
        Masculino, Feminino;
    }

    public enum Situacao {
        Ativo, Inativo, Pendente;
    }

    @Id
    @Column(name = "ID", nullable = false, length = 8)
    private String matricula;
    @Column(name = "NOME", nullable = false, length = 64)
    private String nome;
    @Enumerated
    @Column(name = "SEXO", nullable = false, length = 1)
    private Sexo sexo;
    @Column(name = "RG", nullable = false, length = 10)
    private Integer rg;
    @Column(name = "NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;
    @Column(name = "SITUACAO", nullable = false, length = 1)
    private Situacao situacao;
    @Column(name = "EMAIL", nullable = true, length = 64)
    private String email;
    @Embedded
    private Endereco endereco = new Endereco();
    @Embedded
    private Telefone telefone = new Telefone();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo=" + sexo +
                ", rg=" + rg +
                ", dataNascimento=" + dataNascimento +
                ", situacao=" + situacao +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", telefone=" + telefone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
