
package com.mycompany.products;

public class Remedio extends Produtos {

    private String nomeRemedio;
    private boolean ReceitaRemedio;
    private Double PrecoRemedio;
    private String TipoRemedio;
    private int Quantidade;
    private String FarmaceuticaRemedio;
    private String MarcaRemedio;

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

    public double getPrecoRemedio() {
        return this.PrecoRemedio;
    }

    public void setPrecoRemedio(double PrecoRemedio) {
        this.PrecoRemedio = PrecoRemedio;
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
        return this.PrecoRemedio;
    }

}