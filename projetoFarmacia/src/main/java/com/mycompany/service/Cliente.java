package com.mycompany.service;

public class Cliente {

    private String Nome;
    private String CPF;
    private String Telefone;

    public Cliente(String Nome, String CPF, String Telefone) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
    
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

    public void setTelefone(String input) {
        this.Telefone = input;
    }

    public String getTelefone() {
        return this.Telefone;
    }

}
