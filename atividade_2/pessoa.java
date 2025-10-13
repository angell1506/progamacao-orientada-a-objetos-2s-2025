package atividade_2;

public abstract class pessoa {
    protected String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public abstract void exibirInfo();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}