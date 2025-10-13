package atividade_2;

public class revista extends material {
    private String autor;

    public revista(String titulo, Integer anoPublicacao, String autor) {
        super(título, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void descricao() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Autor: " + autor);
    }
}