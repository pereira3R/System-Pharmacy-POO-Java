
package com.mycompany.service;

public class Farmaceutico extends Funcionario {

    private double salario = getSalarioBase();
    private double vendas;
    protected int permissao;

    public Farmaceutico(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site,
            double SalarioBase, String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
    }

    public void setSalario(double input) {
        this.salario = input;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setVendas(double input) {
        this.vendas = input;
    }

    public double getVendas() {
        return this.vendas;
    }

    public void calcularSalario(double input) {
        super.calcularSalario(getSalarioBase() * input * 0.1);
    }
}
