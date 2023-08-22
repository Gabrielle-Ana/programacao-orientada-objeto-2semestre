public class verificaNumeroPrimo {

    public static void main(String[] args) {
        int numero = 17;  // Você pode alterar esse número para testar outros valores
        System.out.println(verificaNumeroPrimo(numero));
    }

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;  // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;  // Número não é primo
            }
        }
        return 1;  // Número é primo
    }
}
