package com.mycompany.service;

public class Farmacia {

    private String Name;
    private String CNPJ;
    private String Endereco;
    private String Telefone;
    private String Site;

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

}
