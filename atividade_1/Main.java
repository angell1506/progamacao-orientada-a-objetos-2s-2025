package atividade_1;

public class Main {
    public static void main(String[] args) {
        // Criar computador
        Computador comp = new Computador(16, 512, 4, 2.5f); // 16GB RAM, 512GB SSD, 4 núcleos, 2.5 ops/seg

        // Sistema Operacional
        SistemaOperacional so = new SistemaOperacional(comp);

        // Programa 1: deve funcionar
        Programa prog1 = new Programa(8, 100, 2, 10000);

        // Programa 2: erro na instalação (SSDOcupado > SSD)
        Programa prog2 = new Programa(4, 600, 2, 5000);

        // Programa 3: erro na execução (memoriaRAMAlocada > RAM disponível)
        Programa prog3 = new Programa(32, 100, 2, 7000);

        System.out.println("Executando programa 1:");
        so.executarPrograma(prog1);
        System.out.println();

        System.out.println("Executando programa 2:");
        so.executarPrograma(prog2);
        System.out.println();

        System.out.println("Executando programa 3:");
        so.executarPrograma(prog3);
    }
}