package sistema_radar;

public class Carro {
    public String placa;
    private Integer velocidade;
    public Integer ano;
    public String modelo;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo){
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public Integer getVelocidade(){
        return this.velocidade;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public String getModelo(){
        return this.modelo;
    }
    public Integer getAno(){
        return this.ano;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }
    public void setVelocidade(Integer velocidade){
        if(velocidade >= 0){
            this.velocidade = velocidade;
        }
    }
    public void acelerar() {
        this.velocidade += 10;
    }

    public void frear() {
        if(this.velocidade >0){
            this.velocidade -= 10;
        }
    }
}