package com.mycompany.service;

import com.mycompany.products.Produtos;

public abstract class Funcionario extends Farmacia {

    private String Nome;
    private String CPF;
    private String tipoFuncionario;
    private double salario;
    private int certificado = 0;

    public Funcionario(String NomeFarmacia, String CNPJ, String Endereco, String Telefone, String Site,
            double SalarioBase,
            String Nome, String CPF, String tipoFuncionario, int certificado) {
        super(NomeFarmacia, CNPJ, Endereco, Telefone, Site, SalarioBase);
        this.Nome = Nome;
        this.CPF = CPF;
        this.tipoFuncionario = tipoFuncionario;
        this.certificado = certificado;
    }

    public void setNome(String input) {
        this.Nome = input;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setCPF(String input) {
        this.CPF = input;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setTipoFuncionario(String input) {
        this.tipoFuncionario = input;
    }

    public String getTipoFuncionario() {
        return this.tipoFuncionario;
    }

    public void setSalario(double input) {
        this.salario = input;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setCertificado(int input) {
        this.certificado = input;
    }

    public int getCertificado() {
        return this.certificado;
    }

    public abstract void calcularSalario(Produtos input);

    public abstract void calcularComissaoVendas(int input);
}
