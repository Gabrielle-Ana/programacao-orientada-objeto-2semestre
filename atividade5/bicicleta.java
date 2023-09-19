package atividade5;

public class bicicleta extends veiculo {
    public bicicleta(String marca, String modelo, int anoFabricacao) {
        super(marca, modelo, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está sendo pedalada mais rapidamente!");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando!");
    }
}