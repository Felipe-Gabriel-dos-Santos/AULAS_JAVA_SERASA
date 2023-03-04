package POO.Classes;

public class Tanque {

    private static int quantidadeMaximaDeLitrosNoTanque = 50;
    private static int quantidadeMinimaDeLitrosNoTanque = 0;

    private static int quantidadeDeLitrosNoTanque = 0;
    
    public void Encher(int quantidadeEmLitros) {
        if ((quantidadeDeLitrosNoTanque + quantidadeEmLitros) > quantidadeMaximaDeLitrosNoTanque) {
            quantidadeEmLitros = quantidadeMaximaDeLitrosNoTanque;
        }
        quantidadeDeLitrosNoTanque += quantidadeEmLitros;
    }

    public void Consumir(int quantidadeEmLitros) {
        if ((quantidadeDeLitrosNoTanque - quantidadeEmLitros) < quantidadeMinimaDeLitrosNoTanque) {
            quantidadeEmLitros = quantidadeMinimaDeLitrosNoTanque;
        }
        quantidadeDeLitrosNoTanque -= quantidadeEmLitros;
    } 

    public int VerificaQuantidadeNoTanque() {
        return quantidadeDeLitrosNoTanque;
    }

    public int RetornaQuantidadeMaximaTanque() { 
        return quantidadeMaximaDeLitrosNoTanque;
    }

    public int RetornaQuantidadeMinimaTanque() { 
        return quantidadeMinimaDeLitrosNoTanque;
    }
}
