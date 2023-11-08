public class Veiculo {
    String marca;
    String modelo;
    String tipo;
    int ano;

    public void acelerar() {
        System.out.format("O carro %s está acelerando\n", modelo);
    }

    public void frear() {
        System.out.format("O carro %s está freando\n", modelo);
    }
}
