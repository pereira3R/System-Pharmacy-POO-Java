
package com.mycompany.service;

public class Vendedor extends Funcionario {

    private int vendas;
    private double salario;
    protected int permissao;

    public Vendedor(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase,
            String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
    }

    public void setVendas(int input) {
        this.vendas = input;
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setSalario(double input) {
        this.salario = input;
    }

    public double getSalario() {
        return this.salario;
    }

    public void calcularSalario(double input) {
        super.calcularSalario(getSalarioBase() * input * 0.1);
    }
}