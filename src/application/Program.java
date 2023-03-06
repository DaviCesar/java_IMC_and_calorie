package application;


import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa;


        System.out.println("-- Taxa de Metabolismo Basal --");
        System.out.print("Peso em kg: ");
        double peso = sc.nextInt();
        System.out.print("Altura em metros ( ex: 1.83 ): ");
        double altura = sc.nextDouble();
        System.out.print("Idade: ");
        int idade = sc.nextInt();

        pessoa = new Pessoa(peso, altura, idade);

        System.out.printf("Sua TMB é aproximadamente = %.2f%n", pessoa.taxaBasal());

        System.out.printf("Seu IMC é: %.2f%n", pessoa.imc());
        double imc = pessoa.imc();

        if (imc < 18.5){
            System.out.printf("Magreza");
        }else if (imc < 25.0){
            System.out.printf("Normal");
        }else if (imc < 30.0){
            System.out.printf("SOBREPESO");
        }else if (imc < 40.0){
            System.out.printf("OBESIDADE");
        }else {
            System.out.printf("OBESIDADE GRAVE");
        }



        sc.close();
    }
}
