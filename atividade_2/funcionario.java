package atividade_2;

public class funcionario extends pessoa {
    private String cargo;

    public funcionario(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Cargo: " + cargo);
    }
}