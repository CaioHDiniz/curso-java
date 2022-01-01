package Curso.java.model;

import java.util.Objects;

public class Caio {
    private String nome;
    private String cor;
    private Integer idade;

    public Caio() {
    }

    public Caio(String nome, String cor, Integer odade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = odade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Caio caio = (Caio) o;
        return Objects.equals(nome, caio.nome) && Objects.equals(cor, caio.cor) && Objects.equals(idade, caio.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "caio{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getOdade() {
        return idade;
    }

    public void setOdade(Integer odade) {
        this.idade = odade;
    }
}
