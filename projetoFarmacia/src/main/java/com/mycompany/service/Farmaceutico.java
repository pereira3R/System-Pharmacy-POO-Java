
package com.mycompany.service;

import com.mycompany.products.Produtos;

public class Farmaceutico extends Funcionario {

    private double salario;
    private double vendas;
    protected int permissao;

    public Farmaceutico(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site,
            double SalarioBase, String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
        this.salario = getSalarioBase();
    }

    public void setSalario(double input) {
        this.salario += input;
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

    @Override
    public void calcularSalario(Produtos produto) {
        setSalario(produto.getPreco() * 0.1);
    }

    @Override
    public void calcularComissaoVendas(int vendas) {

    }
}
