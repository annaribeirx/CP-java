public class Carro extends Veiculo{
    int quantidadeDePortas;

public Carro(String marca, String modelo, int ano, int quantidadeDePortas){
    this.quantidadeDePortas = quantidadeDePortas;
}
public Carro(){
    this.quantidadeDePortas = quantidadeDePortas;
}
    public void acelerar() {
    System.out.format("O %s %s está acelerando\n", marca, modelo);
    }
    public void abrirPorta(){
    System.out.format("Abrindo as %d portas do %s %s\n", quantidadeDePortas, marca, modelo);
    }
}
