package atividade5;

public abstract class veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;

    public veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void acelerar();

    public abstract void frear();


}
