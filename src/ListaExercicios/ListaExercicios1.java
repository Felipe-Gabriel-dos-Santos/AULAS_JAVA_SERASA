package ListaExercicios;

import utils.Layout.Layout;

public class ListaExercicios1 {
    public static void Ex1() {
        Layout.Output("Olá, Mundo!");
    }

    public static void Ex2() {
        String nome = Layout.Input("Digite o seu nome:");
        Layout.Output("Olá " + nome + ", é um prazer te conhecer!");

    }

    public static void Ex3() {
        String nomeFunc = Layout.Input("Digite o seu nome:");
        String salarioFunc = Layout.Input("Digite o seu salário:");

        Layout.Output("O funcionário " + nomeFunc + "tem um salário de R$"+ salarioFunc +" em Junho");
    }

    public static void Ex4() {
        Integer valor1 = Layout.InputInteger("Digite o primeiro número");;
        Integer valor2 = Layout.InputInteger("Digite o segundo número");;

        Integer soma = valor1 + valor2;

        Layout.Output("A soma dos números " + valor1 + " e " + valor2 + " é igual a " + soma);
    }

    public static void Ex5() {
        Integer nota1 = Layout.InputInteger("Digite a primeira nota");;
        Integer nota2 = Layout.InputInteger("Digite a segunda nota");;

        Integer media = (nota1 + nota2) / 2;

        Layout.Output("A média dos números " + nota1 + " e " + nota2 + " é igual a " + media);
    }

    public static void Ex6() {
        Integer numeroInteiro = Layout.InputInteger("Digite um número inteiro");;
       
        Integer numeroAntecessor = numeroInteiro - 1;
        Integer numeroSucessor = numeroInteiro + 1;

        Layout.Output("Antecessor: " + numeroAntecessor + " Número: " + numeroInteiro + " Sucessor: " + numeroSucessor);
    }

     public static void Ex7() {
        float numeroReal = Layout.InputFloat("Digite um número");;
       
        float dobro = numeroReal * 2;
        float tercaParte = numeroReal / 3;

        Layout.Output("Terça parte: " + tercaParte + ", Dobro: " + dobro);
    }

    public static void Ex8() {
        float distancia = Layout.InputFloat("Digite uma distância em metros:");
        
        float km = distancia / 1000;
        float hm = distancia / 100;
        float dam = distancia / 10;
        float dm = distancia * 10;
        float cm = distancia * 100;
        float mm = distancia * 1000;

        Layout.Output("A distância de " + distancia + "m corresponde a:\n"
                + km + " Km\n"
                + hm + " Hm\n"
                + dam + " Dam\n"
                + dm + " dm\n"
                + cm + " cm\n"
                + mm + " mm");
    }
    public static void Ex9() {
        float dinheiro = Layout.InputFloat("Digite quanto dinheiro você tem na carteira:");
        float dolares = dinheiro / 3.45f;

        Layout.Output("Com R$" + dinheiro + " você pode comprar US$" + dolares);
    }
    public static void Ex10() {
        float largura = Layout.InputFloat("Digite a largura da parede em metros:");
        float altura = Layout.InputFloat("Digite a altura da parede em metros:");
        float area = largura * altura;
        float litrosTinta = area / 2;

        Layout.Output("A área a ser pintada é de " + area + " metros quadrados e serão necessários " + litrosTinta + " litros de tinta.");
    }
    public static void Ex11() {
        float a = Layout.InputFloat("Digite o valor de A:");
        float b = Layout.InputFloat("Digite o valor de B:");
        float c = Layout.InputFloat("Digite o valor de C:");
        float delta = b * b - 4 * a * c;

        Layout.Output("O valor de delta é: " + delta);
    }
    public static void Ex12() {
        float preco = Layout.InputFloat("Digite o preço do produto:");
        float precoPromocional = preco * 0.95f;

        Layout.Output("O preço promocional do produto é de R$" + precoPromocional);
    }
    public static void Ex13() {
        float salario = Layout.InputFloat("Digite o salário do funcionário:");
        float novoSalario = salario * 1.15f;

        Layout.Output("O novo salário do funcionário é de R$" + novoSalario);
    }
    public static void Ex14() {
        float kmRodados = Layout.InputFloat("Digite a quantidade de km percorridos:");
        int diasAlugado = Layout.InputInteger("Digite a quantidade de dias que o carro foi alugado:");
        float precoKm = 0.2f * kmRodados;
        float precoDiaria = 90 * diasAlugado;
        float precoTotal = precoKm + precoDiaria;

        Layout.Output("O preço total a pagar é de R$" + precoTotal);
    }
    public static void Ex15() {
        int dias = Layout.InputInteger("Digite o número de dias trabalhados no mês:");
        float salario = dias * 8 * 25;
        
        Layout.Output("O salário do funcionário é: R$" + salario);
    }
    public static void Ex16() {
        int cigarrosPorDia = Layout.InputInteger("Quantos cigarros você fuma por dia?");
        int anosFumando = Layout.InputInteger("Há quantos anos você fuma?");
        int minutosPerdidos = cigarrosPorDia * anosFumando * 10;
        int diasPerdidos = minutosPerdidos / 1440;
        
        Layout.Output("Você perdeu aproximadamente " + diasPerdidos + " dias de vida fumando.");
    }

}
