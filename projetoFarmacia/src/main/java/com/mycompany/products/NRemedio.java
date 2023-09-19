package com.mycompany.products;

public class NRemedio extends Produtos {

    private String nomeProduto;
    private double PrecoProduto;
    private String FabricanteProduto;
    private String SecaoProduto;
    private String MarcaProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return this.PrecoProduto;
    }

    public void setPrecoProduto(double PrecoProduto) {
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

    public String getMarcaProduto() {
        return this.MarcaProduto;
    }

    public void setMarcaProduto(String MarcaProduto) {
        this.MarcaProduto = MarcaProduto;
    }

    @Override
    public double PrecoProduto() {
        return this.PrecoProduto;
    }
}
