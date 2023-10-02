package com.mycompany.service;

import java.util.ArrayList;
import com.mycompany.products.Produtos;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private double valorTotalCompra = 0;
    ArrayList<Produtos> compras = new ArrayList<Produtos>();
    private Funcionario atendidoPor;
    private int contaCompras = 0;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCPF(String cpf) {
        // Adicione validações de CPF aqui, se necessário
        this.cpf = cpf;
    }

    public String getCPF() {
        return this.cpf;
    }

    public void setTelefone(String telefone) {
        // Adicione validações de telefone aqui, se necessário
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = this.valorTotalCompra + valorTotalCompra;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setCompras(Produtos compraCliente) {
        this.compras.add(compraCliente);
    }

    public ArrayList<Produtos> getCompras() {
        // Retornar uma cópia da lista para evitar modificações externas
        return this.compras;
    }

    public void setAtendidoPor(Funcionario input) {
        this.atendidoPor = input;
    }

    public Funcionario getAtendidoPor() {
        return this.atendidoPor;
    }

    public void setContaCompras(int input) {
        this.contaCompras += input;
    }

    public int getContaCompras() {
        return this.contaCompras;
    }
}
