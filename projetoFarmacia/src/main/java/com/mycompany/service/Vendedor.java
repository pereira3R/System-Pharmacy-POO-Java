
package com.mycompany.service;

import com.mycompany.products.Produtos;

public class Vendedor extends Funcionario {

    private int vendas;
    private double salario;
    protected int permissao;

    public Vendedor(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase,
            String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase, Nome, CPF, tipoFuncionario, certificado);
        this.salario = 0;
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
        setSalario(produto.getPreco() * 0.1);
    }

    @Override
    public void calcularComissaoVendas(int vendas) {

    }
}
