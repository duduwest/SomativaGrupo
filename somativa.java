package SomativaGrupo;

import java.util.Scanner;

public class somativa {
    Scanner sc = new Scanner(System.in);

    public void atividades() {
        System.out.println("Informe seu Nome:");
        String nome = sc.nextLine();
        System.out.println("Informe sua Idade:");
        int idade = sc.nextInt();
        System.out.println("Informe seu Genêro sexual (1-Feminino 2-Masculino)");
        int Genêro = sc.nextInt();
        System.out.println("Informe sua Altura");
        double altura = sc.nextDouble();
        System.out.println("Informe seu Peso");
        double peso = sc.nextDouble();
        double pesoIdeal = 0;
        if (Genêro == 1) {
            pesoIdeal = 72.7 * altura - 58;
        } else {
            pesoIdeal = 62.1 * altura - 44.7;}

        System.out.println("Seu peso ideal é " + pesoIdeal + "Kg");

        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é " + imc);
        int faixaDeIdade = 0;
        if (idade >= 16 && idade <= 25) {
            faixaDeIdade = 1;
        } else if (idade >= 26 && idade <= 35) {
            faixaDeIdade = 2;
        } else if (idade >= 36 && idade <= 45) {
            faixaDeIdade = 3;

        } else if (idade >= 46 && idade <= 55) {
            faixaDeIdade = 4;
        } else if (idade >= 56 && idade <= 65) {
            faixaDeIdade = 5;
        } else {
            faixaDeIdade = 6;
        }
        int dificuldade = 0;
        if (imc < 20) {
            dificuldade = 1;
        } else if (imc >= 20 && imc <= 27) {
            dificuldade = 2;
        } else if (imc > 27) {
            dificuldade = 3;
        }
        double diferencaDePeso = 0;
        if (peso > pesoIdeal) {
            diferencaDePeso = peso - pesoIdeal;
            System.out.println("Você precisará perder " + diferencaDePeso + "Kgs");
        } else if (peso < pesoIdeal) {
            diferencaDePeso = pesoIdeal - peso;
            System.out.println("Você precisará ganhar " + diferencaDePeso + "Kgs");
        } else {
            System.out.println("Você está no peso ideal");
        }
        System.out.println("Recomenda-se praticar tais atividades :");
        /* 1 dificil 2 moderado 3 facil */
        if (dificuldade == 1 && faixaDeIdade == 2 || dificuldade == 1 && faixaDeIdade == 3) {
            System.out.println("Musculação Intensa");
        }
        if (dificuldade == 2 && faixaDeIdade == 1 || dificuldade == 2 && faixaDeIdade == 2
                || dificuldade == 2 && faixaDeIdade == 3 || dificuldade == 2 && faixaDeIdade == 4) {
            System.out.println("Musculação Moderada");
        }
        if (dificuldade == 3 && faixaDeIdade == 1 || dificuldade == 3 && faixaDeIdade == 4
                || dificuldade == 3 && faixaDeIdade == 6 || dificuldade == 3 && faixaDeIdade == 5) {
            System.out.println("Musculação Leve");
        }
        if (dificuldade == 1 && faixaDeIdade == 1 || dificuldade == 1 && faixaDeIdade == 2
                || dificuldade == 1 && faixaDeIdade == 3 || dificuldade == 1 && faixaDeIdade == 4) {
            System.out.println("Luta");
        }
        if (dificuldade == 2) {
            System.out.println("Dança");
        }
        if (dificuldade == 1 && faixaDeIdade == 4 || dificuldade == 1 && faixaDeIdade == 6
                || dificuldade == 1 && faixaDeIdade == 5) {
            System.out.println("Pilates");
        }
        if (dificuldade == 2 && faixaDeIdade == 2 || dificuldade == 2 && faixaDeIdade == 3
                || dificuldade == 2 && faixaDeIdade == 4 || dificuldade == 2 && faixaDeIdade == 5) {
            System.out.println("Corrida");
        }
        if (dificuldade == 3) {
            System.out.println("Ioga");
        }
    }

}
