package ListaExercicios;

import java.time.Year;

import utils.Layout.Layout;

public class ListaExerciciosCondicional {
    public static void Ex1() {
        int velocidade = Layout.InputInteger("Digite a velocidade do carro em Km/h: ");
        int limiteVelocidade = 80;
        int valorMulta = 0;
        
        if (velocidade > limiteVelocidade) {
            int kmAcima = velocidade - limiteVelocidade;
            valorMulta = kmAcima * 5;
            
            Layout.Output("Você foi multado em R$" + valorMulta);
        } else {
            Layout.Output("Você está dentro do limite de velocidade");
        }
    }
    public static void Ex2() {
        int anoNascimento = Layout.InputInteger("Digite o ano de nascimento: ");
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        
        if (idade < 16) {
            Layout.Output("Você não pode votar");
        } else if (idade >= 18 && idade <= 70) {
            Layout.Output("Você é obrigado a votar");
        } else {
            Layout.Output("Você pode votar, mas não é obrigado");
        }
    }
    public static void Ex3() {
        String nome = Layout.Input("Digite o nome do aluno: ");
        float nota1 = Layout.InputFloat("Digite a primeira nota do aluno: ");
        float nota2 = Layout.InputFloat("Digite a segunda nota do aluno: ");
        float media = (nota1 + nota2) / 2;
        
        Layout.Output("A média do aluno " + nome + " é " + media);
        
        if (media >= 7) {
            Layout.Output("O aluno " + nome + " teve um bom aproveitamento");
        } else {
            Layout.Output("O aluno " + nome + " não teve um bom aproveitamento");
        }
    }
    public static void Ex4() {
        int numero = Layout.InputInteger("Digite um número inteiro: ");
        
        if (numero % 2 == 0) {
            Layout.Output("O número " + numero + " é PAR");
        } else {
            Layout.Output("O número " + numero + " é ÍMPAR");
        }
    }
    public static void Ex5() {
        int ano = Layout.InputInteger("Digite um ano:");
        
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            Layout.Output("O ano " + ano + " é BISSEXTO.");
        } else {
            Layout.Output("O ano " + ano + " não é BISSEXTO.");
        }
    }
    public static void Ex6() {
        int anoNascimento = Layout.InputInteger("Digite o ano de nascimento:");
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        
        if (idade < 18) {
            int anosFaltantes = 18 - idade;
            Layout.Output("Faltam " + anosFaltantes + " anos para o alistamento.");
        } else {
            int anosPassados = idade - 18;
            Layout.Output("Já se passaram " + anosPassados + " anos do alistamento.");
        }
    }
    public static void Ex7() {
        String nome = Layout.Input("Digite o nome do cliente:");
        String sexo = Layout.Input("Digite o sexo do cliente (M para masculino e F para feminino):");
        float valorCompras = Layout.InputFloat("Digite o valor das compras:");
        float desconto = 0;
        
        if (sexo.equalsIgnoreCase("F")) {
            desconto = valorCompras * 0.13f;
        } else {
            desconto = valorCompras * 0.05f;
        }
        
        float valorFinal = valorCompras - desconto;
        Layout.Output("Cliente: " + nome + "\nValor das compras: R$" + valorCompras + "\nDesconto: R$" + desconto + "\nValor final: R$" + valorFinal);
    }
    public static void Ex8() {
        float distancia = Layout.InputFloat("Qual a distância que você deseja percorrer em Km?");
        
        float preco;
        if (distancia <= 200) {
            preco = distancia * 0.5f;
        } else {
            preco = distancia * 0.45f;
        }
        
        Layout.Output("O preço da passagem é: R$" + preco);
    }
    public static void Ex9Desafio() {
        int comprimentoPrimeiroSegmento = Layout.InputInteger("Digite o comprimento do primeiro segmento: ");
        int comprimentoSegundoSegmento = Layout.InputInteger("Digite o comprimento do segundo segmento: ");
        int comprimentoTerceiroSegmento = Layout.InputInteger("Digite o comprimento do terceiro segmento: ");

        if (comprimentoPrimeiroSegmento < comprimentoSegundoSegmento + comprimentoTerceiroSegmento && 
            comprimentoSegundoSegmento < comprimentoPrimeiroSegmento + comprimentoTerceiroSegmento && 
            comprimentoTerceiroSegmento < comprimentoPrimeiroSegmento + comprimentoSegundoSegmento) 
            {
                Layout.Output("Os segmentos podem formar um triângulo.");
            } 
            else {
                Layout.Output("Os segmentos não podem formar um triângulo.");
            }
    }
}
