package POO.Classes;

import java.util.Random;

public class Carro {

    private boolean status = true;

    private int velocidadeMaxima = 180;
    private int velocidadeAtual = 0;

    public Tanque tanque = new Tanque();

    public void ligar() {
        if (status) System.out.println("O carro já está ligado :/");
        else System.out.println("O carro está ligado ;)");
        status = true;
    }

    public void desligar() {
        if (!status) System.out.println("O carro já está desligado :/");
        else System.out.println("O carro está desligado ;)");
        status = false;
    }

    public void alternar() {
        if (status) desligar();
        else ligar();
    }

    public void andar() {

        while (status) {
            if (velocidadeAtual < velocidadeMaxima) 
                velocidadeAtual += velocidadeMaxima / new Random().nextDouble(0.1, 0.5);

                int quantidadeEmLitros = Math.round(velocidadeAtual);
                tanque.Consumir(quantidadeEmLitros);

                int quantidadeCombustivel = tanque.VerificaQuantidadeNoTanque();
                status = status && quantidadeCombustivel > 0;
        }
    }

    public void parar() {
        velocidadeAtual = 0;
        status = false;
    }

}
