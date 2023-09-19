
package com.mycompany.products;

public class Remedio extends Produtos {

    private String nomeRemedio;
    private boolean ReceitaRemedio;
    private String TipoRemedio;
    private int Quantidade;
    private String FarmaceuticaRemedio;
    private String MarcaRemedio;

    public Remedio(String Nome, double Preco, String Tipo, String Marca, String nomeRemedio, boolean ReceitaRemedio,
            String TipoRemedio, int Quantidade, String FarmaceuticaRemedio, String MarcaRemedio) {
        super(Nome, Preco, Tipo, Marca);
        this.nomeRemedio = nomeRemedio;
        this.ReceitaRemedio = ReceitaRemedio;
        this.TipoRemedio = TipoRemedio;
        this.Quantidade = Quantidade;
        this.FarmaceuticaRemedio = FarmaceuticaRemedio;
        this.MarcaRemedio = MarcaRemedio;
    }

    public String getNomeRemedio() {
        return this.nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public boolean isReceitaRemedio() {
        return this.ReceitaRemedio;
    }

    public void setReceitaRemedio(boolean ReceitaRemedio) {
        this.ReceitaRemedio = ReceitaRemedio;
    }

    public String getTipoRemedio() {
        return TipoRemedio;
    }

    public void setTipoRemedio(String TipoRemedio) {
        this.TipoRemedio = TipoRemedio;
    }

    public int getQuantidade() {
        return this.Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getFarmaceuticaRemedio() {
        return FarmaceuticaRemedio;
    }

    public void setFarmaceuticaRemedio(String FarmaceuticaRemedio) {
        this.FarmaceuticaRemedio = FarmaceuticaRemedio;
    }

    public String getMarcaRemedio(String MarcaRemedio) {
        return this.MarcaRemedio;
    }

    public void setMarcaRemedio(String MarcaRemedio) {
        this.MarcaRemedio = MarcaRemedio;
    }

    @Override
    public double PrecoProduto() {
        return this.getPreco();
    }

}