
package com.mycompany.products;

public abstract class Produtos {
    private String Nome;
    private String Preco;
    private String Tipo;
    private String Marca;
    
    public String void getNome(){
        return this.Nome;
    }

    public String void getPreco(){
        return this.Preco;
    }

    public String void getTipo(){
        return this.Tipo;
    }

    public String void getMarca(){
        return this.Marca;
    }

    public String void setNome(String Nome){
        this.Nome = Nome;
    }

    public String void setPreco(String Preco){
        this.Preco = Preco;
    }

    public String void setTipo(String Tipo){
        this.Tipo = Tipo;
    }

    public String void setMarca(String Marca){
        this.Marca = Marca;
    }

    public abstract void PrecoProduto();
}
