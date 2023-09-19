package com.mycompany.service;

import com.mycompany.products.Produtos;
import java.util.ArrayList;

public class Cliente {

    private String Nome;
    private String CPF;
    private String Telefone;
    private double valorTotalCompra;
    private ArrayList<Produtos> Compras = new ArrayList<Produtos>();

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

    public void setValorTotalCompra(double input) {
        this.valorTotalCompra = input;
    }

    public double getValorTotalCompra() {
        return this.valorTotalCompra;
    }

    public void setCompras(Produtos compraCliente) {
        this.Compras.add(compraCliente);

    }

    public Produtos getCompras(int posCompra) {

        return this.Compras.get(posCompra);
    }

}
