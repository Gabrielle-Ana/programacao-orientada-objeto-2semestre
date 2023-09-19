package atividade5;

public class Executavel {
    public static void main(String[] args) {
        veiculo carro = new carro("Toyota", "Corolla", 2023);
        veiculo moto = new moto("Honda", "CBR500R", 2023);
        veiculo bicicleta = new bicicleta("Caloi", "Mountain Bike", 2023);

        carro.acelerar();
        moto.acelerar();
        bicicleta.acelerar();

        carro.frear();
        moto.frear();
        bicicleta.frear();
    }
}
