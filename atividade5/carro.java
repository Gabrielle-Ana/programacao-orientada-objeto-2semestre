package atividade5;

public class carro extends veiculo {
    public carro(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando!");
    }
}