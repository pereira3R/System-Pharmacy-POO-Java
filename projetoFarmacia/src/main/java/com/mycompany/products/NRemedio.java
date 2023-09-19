package com.mycompany.products;

public class NRemedio extends Produtos {

    private String nomeProduto;
    private String FabricanteProduto;
    private String SecaoProduto;
    private String MarcaProduto;

    public NRemedio(String Nome, double Preco, String Tipo, String Marca,
            String FabricanteProduto, String SecaoProduto) {
        super(Nome, Preco, Tipo, Marca);
        this.nomeProduto = Nome;
        this.FabricanteProduto = FabricanteProduto;
        this.SecaoProduto = SecaoProduto;
        this.MarcaProduto = Marca;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
        return this.getPreco();
    }
}
