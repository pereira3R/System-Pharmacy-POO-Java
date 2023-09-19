
package com.mycompany.products;

public abstract class Produtos {
    private String Nome;
    private String Preco;
    private String Tipo;
    private String Marca;

    public String getNome() {
        return this.Nome;
    }

    public String getPreco() {
        return this.Preco;
    }

    public String getTipo() {
        return this.Tipo;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setPreco(String Preco) {
        this.Preco = Preco;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public abstract double PrecoProduto();
}
