package atividade_2;

public class livro extends material {
    private String edicao;

    public livro(String titulo, Integer anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Edição: " + edicao);
    }
}