package entities;

public class Pessoa {

    private double peso;
    private double altura;
    private int idade;

    public Pessoa (double peso, double altura, int idade) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public double taxaBasal() {
        return 66 + (13.8 * peso) + (5 * (altura * 100)) - (6.8 * idade);
    }

    public double imc() {
        return peso / (altura * altura);
    }
}
