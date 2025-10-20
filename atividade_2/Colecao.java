public class Colecao  {
    private String Proprietario;
    private String QuantidadeItens;
   

    public Colecao(String Proprietario, String QuantidadeItens) {
        this.Proprietario = Proprietario;
        this.QuantidadeItens = QuantidadeItens;
    }

    public String getProprietario() {
        return this.Proprietario;
    }

    public void setProprietario(String Proprietario) {
        this.Proprietario = Proprietario;
    }

    public String getQuantidadeItens() {
        return this.QuantidadeItens;
    }

    public void setQuantidadeItens(String QuantidadeItens) {
        this.QuantidadeItens = QuantidadeItens;
    }

}