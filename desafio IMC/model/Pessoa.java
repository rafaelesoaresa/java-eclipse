package model;

public class Pessoa {
    private int id;
    private String nome;
    private char sexo;
    private double altura;
    private int idade;
    private double peso;
    private double imc;

    // Getters e setters
    // Construtores
    // Método para calcular o IMC
    public void calcularIMC() {
        imc = peso / (altura * altura);
    }

    public Pessoa(int id, String nome, char sexo, double altura, int idade, double peso, double imc) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
        this.imc = imc;
    }

    public Pessoa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}
