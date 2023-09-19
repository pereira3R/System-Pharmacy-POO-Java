package com.mycompany.products;

public class NRemedio extends Produtos {

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(String PrecoProduto) {
        this.PrecoProduto = PrecoProduto;
    }

    public String getFabricanteProduto() {
        return FabricanteProduto;
    }

    public void setFabricanteProduto(String FabricanteProduto) {
        this.FabricanteProduto = FabricanteProduto;
    }

    public String getSecaoProduto() {
        return SecaoProduto;
    }

    public void setSecaoProduto(String SecaoProduto) {
        this.SecaoProduto = SecaoProduto;
    }

    public void getMarcaProduto(){
        return MarcaProduto;
    }

    public void setMarcaProduto(String MarcaProduto){
        this.MarcaProduto = MarcaProduto;
    }

    private String nomeProduto;
    private String PrecoProd;
    private String FabricanteProduto;
    private String SecaoProduto;
    private String MarcaProduto;
    
    @Override
    public double void PrecoProduto(){
        return this.PrecoProd;
    }
}
