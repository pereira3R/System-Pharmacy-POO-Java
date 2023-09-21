
package com.mycompany.service;

import com.mycompany.products.Produtos;

public class Vendedor extends Funcionario {

    private int vendas;
    private double salario;
    protected int nivelAcesso = 1;

    public Vendedor(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase,
            String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
        this.salario = SalarioBase;
        this.vendas = 0;
    }

    public void setVendas(int input) {
        this.vendas += input;
    }

    public int getVendas() {
        return this.vendas;
    }

    public void setSalario(double input) {
        this.salario += input;
    }

    public double getSalario() {
        return this.salario;
    }

    @Override
    public void calcularSalario(Produtos produto) {
        setSalario(this.salario + produto.getPreco() * 0.1);
    }

    @Override
    public void calcularComissaoVendas(int vendas) {
        if (vendas > 6) {
            setSalario(getSalarioBase() * 0.1);
        }
    }

    @Override
    public int getNivelAcesso(int input) {

        return this.nivelAcesso;
    }
}
