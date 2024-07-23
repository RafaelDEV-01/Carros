package Metodos;

public class Carros {
    String cor;
    String modelo;
    double valor;
    boolean estado;

    public Carros() {
    }
    public Carros(String cor) {
        this.cor = cor;
    }
    public Carros(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }
    public Carros(String cor, String modelo, double valor) {
        this.cor = cor;
        this.modelo = modelo;
        this.valor = valor;
    }
    public void ligar() {
        if (!estado) {
            estado = true;
            System.out.println("Carro foi ligado!");
        } else {
            System.out.println("Carro já está ligado!");
        }
    }
    public void desligar() {
        if (estado) {
            estado = false;
            System.out.println("Carro foi desligado!");
        } else {
            System.out.println("Carro já está desligado!");
        }
    }
    public void status() {
        if (estado) {
            System.out.println("Carro está ligado!");
        } else {
            System.out.println("Carro está desligado!");
        }
    }
}