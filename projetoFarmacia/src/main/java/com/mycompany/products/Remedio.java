
package com.mycompany.products;
public class Remedio extends Produtos{

    public String getNomeRemedio() {
        return nomeRemedio;
    }

    public void setNomeRemedio(String nomeRemedio) {
        this.nomeRemedio = nomeRemedio;
    }

    public boolean isReceitaRemedio() {
        return ReceitaRemedio;
    }

    public void setReceitaRemedio(boolean ReceitaRemedio) {
        this.ReceitaRemedio = ReceitaRemedio;
    }

    public int getPrecoRemedio() {
        return PrecoRemedio;
    }

    public void setPrecoRemedio(int PrecoRemedio) {
        this.PrecoRemedio = PrecoRemedio;
    }

    public String getTipoRemedio() {
        return TipoRemedio;
    }

    public void setTipoRemedio(String TipoRemedio) {
        this.TipoRemedio = TipoRemedio;
    }

    public int getQuantidade() {
        return Quantidade;
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

    public void getMarcaRemedio(String MarcaRemedio){
        return MarcaRemedio;
    }

    public void setMarcaRemedio(String MarcaRemedio){
        this.MarcaRemedio = MarcaRemedio;
    }

    private String nomeRemedio;
    private boolean ReceitaRemedio;
    private Double PrecoRemedio;
    private String TipoRemedio;
    private String Quantidade;
    private String FarmaceuticaRemedio;
    private String MarcaRemedio;

    @Override
    public Double void PrecoProduto(){
        return this.PrecoProduto;
    }

}