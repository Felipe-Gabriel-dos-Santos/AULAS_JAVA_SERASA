package ListaExercicios;

import utils.Layout.Layout;

public class ListaExerciciosLacoRepeticao {
    public static void Ex1() {
        for (int i = 1; i <= 20; i++) {
            Layout.Output("Eu gosto de estudar Algoritmos!");
        }
    }
    public static void Ex2() {
        int soma = 0;
        for (int i = 1; i <= 15; i++) {
            soma += i;
        }

        Layout.Output("A soma dos números de 1 a 15 é: " + soma);
    }
    public static void Ex3() {
        String nome = Layout.Input("Digite o seu nome:");

        for (int i = 1; i <= 10; i++) {
            Layout.Output(nome);
        }
    }
    public static void Ex4() {
        String nome = Layout.Input("Digite o seu nome:");
        int quantidadeVezesNomeExibido = Layout.InputInteger("Digite a quantidade de vezes que o nome será exibido:");

        for (int i = 1; i <= quantidadeVezesNomeExibido; i++) {
            Layout.Output(nome);
        }
    }
    public static void Ex5() {
        int soma = 0;
        int quantidadeDeNumeros = 10;

        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            int numero = Layout.InputInteger("Digite o número " + i + ":");
            soma += numero;
        }

        Layout.Output("A soma dos " + quantidadeDeNumeros + " números é: " + soma);
    }
    public static void Ex6() {
        int somaIdades = 0;
        int quantidadeDeIdades = 20;

        for (int i = 1; i <= quantidadeDeIdades; i++) {
            int idade = Layout.InputInteger("Digite a idade da pessoa " + i + ":");
            somaIdades += idade;
        }

        Layout.Output("A soma das " + quantidadeDeIdades + " idades é: " + somaIdades);
    }
    public static void Ex7() {
        int somaIdades = 0;
        int quantidadeDeIdades = 20;

        for (int i = 1; i <= quantidadeDeIdades; i++) {
            int idade = Layout.InputInteger("Digite a idade da pessoa " + i + ":");
            somaIdades += idade;
        }
        float mediaDasIdades = somaIdades / quantidadeDeIdades;
        Layout.Output("A média das idades é: " + mediaDasIdades);
    }
    public static void Ex8() {
        int quantidadeMaioresIdade = 0;

        for (int i = 1; i <= 20; i++) {
            int idade = Layout.InputInteger("Digite a idade da pessoa " + i + ":");

            if (idade >= 18) {
                quantidadeMaioresIdade++;
            }
        }
        Layout.Output("Existem " + quantidadeMaioresIdade + " pessoas maiores de idade.");
    }
    public static void Ex9() {
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            String nome = Layout.Input("Digite o nome da pessoa " + i + ":");
            int idade = Layout.InputInteger("Digite a idade da pessoa " + i + ":");
            
            if (idade < idadeMaisNova) {
                nomeMaisNova = nome;
                idadeMaisNova = idade;
            }
        }

        Layout.Output("A pessoa mais nova é: " + nomeMaisNova);
    }
    public static void Ex10() {
        int numero = Layout.InputInteger("Digite um número:");
        StringBuilder tabuadaString = new StringBuilder();
    
        for (int i = 1; i <= 10; i++) {
            tabuadaString.append(numero + " x " + i + " = " + (numero * i) + "\n");
        }

        Layout.Output(tabuadaString.toString());
    }
    public static void Ex12() {
        int quantidadeMaiorOito = 0;

        for (int i = 0; i < 20; i++) {
            int numero = Layout.InputInteger("Digite o " + (i+1) + "º número:");
            
            if (numero > 8) {
                quantidadeMaiorOito++;
            }
        }

        Layout.Output("Existem " + quantidadeMaiorOito + " números maiores do que 8.");
    }
    public static void Ex13() {
        int quantidadeEntreZeroCem = 0;

        for (int i = 0; i < 20; i++) {
            int numero = Layout.InputInteger("Digite um número:");

            if (numero >= 0 && numero <= 100) {
                quantidadeEntreZeroCem++;
            }
        }

        Layout.Output("Foram digitados " + quantidadeEntreZeroCem + " números entre 0 e 100.");
    }
    public static void Ex14() {
        int quantidadeDeNumeros = 20;
        int contador1 = 0, contador2 = 0, contador3 = 0;
        
        for (int i = 1; i <= quantidadeDeNumeros; i++) {
            int numero = Layout.InputInteger("Digite o " + i + "° número:");
            if (numero >= 0 && numero <= 100) {
                contador1++;
            } else if (numero >= 101 && numero <= 200) {
                contador2++;
            } else if (numero > 200) {
                contador3++;
            }
        }
        Layout.Output("Entre 0 e 100: " + contador1 + " números \n Entre 101 e 200: " + contador2 + " números \n Maiores que 200: " + contador3 + " números");

    }
    public static void Ex15() {
        int soma = 0;
        int numero;
        
        do {
            numero = Layout.InputInteger("Digite um número inteiro (digite um negativo para sair): ");
            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);
        
        Layout.Output("A soma dos números digitados é: " + soma);
    }
}
