package atividade5;

public class moto extends veiculo {
    public moto(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando!");
    }
}