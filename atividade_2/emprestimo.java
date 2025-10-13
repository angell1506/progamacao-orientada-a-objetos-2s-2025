package atividade_2;

public class emprestimo {
    private Pessoa pessoa;
    private Paterial material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public emprestimo(Pessoa pessoa, Material material, String dataEmprestimo, String dataDevolucao) {
        this.pessoa = pessoa;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }


    public pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public material getMaterial() {
        return this.material;
    }

    public void setMaterial(material material) {
        this.material = material;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
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
