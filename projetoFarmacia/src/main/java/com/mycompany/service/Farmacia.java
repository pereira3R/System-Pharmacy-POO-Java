package com.mycompany.service;

public abstract class Farmacia {

    private String Name;
    private String CNPJ;
    private String Endereco;
    private String Telefone;
    private String Site;
    private double SalarioBase;

    public Farmacia(String Name, String CNPJ, String Endereco, String Telefone, String Site, double SalarioBase) {
        this.Name = Name;
        this.CNPJ = CNPJ;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Site = Site;
        this.SalarioBase = SalarioBase;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setCNPJ(String input) {
        this.CNPJ = input;
    }

    public String getCNPJ() {
        return this.CNPJ;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getSite() {
        return Site;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public void setSalarioBase(double input) {
        this.SalarioBase = input;
    }

    public double getSalarioBase() {
        return this.SalarioBase;
    }

}
