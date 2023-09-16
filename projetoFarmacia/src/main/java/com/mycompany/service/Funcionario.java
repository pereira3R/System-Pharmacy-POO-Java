package com.mycompany.service;

public class Funcionario extends Farmacia{
    
    double salarioBase = 1000;
    private String Name;
    private int CPF;
    private String tipoFuncionario; 
    private double salario = salarioBase; 
    private boolean certificado;
    
    public void setName(String input){
        this.Name = input;
    }
    public String getName(){
        return this.Name;
    }
    public void setCPF(int input){
        this.CPF = input;
    }
    public int getCPF(){
        return this.CPF;
    }
    public void setTipoFuncionario(String input){
        this.tipoFuncionario = input;
    }
    public String getTipoFuncionario(){
        return this.tipoFuncionario;
    }
    public void setSalario(double input){
        this.salario = input;
    }
    public double getSalario(){
        return this.salario;
    }
    public void setCertificado(boolean input){
        this.certificado  = input;
    }
    public boolean getCertificado(){
        return this.certificado;
    }
    public void calcularSalario(double input){
        this.setSalario(this.getSalario() + input);
    }
    
}
