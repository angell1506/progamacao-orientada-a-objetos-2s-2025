package atividade_2;

public class emprestimo {
    private pessoa pessoa;
    private material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public emprestimo(pessoa pessoa, material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
        System.out.println("Data de Devolução: " + dataDevolucao);
        System.out.println("Informações da Pessoa:");
        pessoa.exibirInfo();
        System.out.println("Informações do Material:");
        material.descricao();
    }
}
