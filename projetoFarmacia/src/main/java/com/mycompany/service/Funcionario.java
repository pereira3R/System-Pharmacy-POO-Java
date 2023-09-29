package com.mycompany.service;

//Importando  a interface: painelControle + classe mãe: Produtos 
import com.mycompany.products.Produtos;

public abstract class Funcionario extends Farmacia {

    protected String Nome;
    protected String CPF;
    protected String tipoFuncionario;
    protected double salario;
    protected int vendas = 0;
    protected int certificado = 0;
    public int nivelAcesso;

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

    public void calculandoLucroFarmacia(double valor) {
        super.setLucroBruto(valor);
    }

    public void setVendas(int inputVendas) {
        this.vendas += inputVendas;
    }

    public int getVendas() {
        return this.vendas;
    }

    public abstract void calcularSalarioPorProduto(Produtos input);

    public abstract void calcularComissaoMeta(int input);
}
