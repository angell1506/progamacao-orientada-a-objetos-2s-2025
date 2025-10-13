package atividade_2;

public class Revista extends Material {
    private String autor;

    public Revista(String titulo, Integer anoPublicacao, String autor) {
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
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Ano de Publicação: " + this.getAnoPublicacao());
        System.out.println("Autor: " + this.getAutor());
    }
}