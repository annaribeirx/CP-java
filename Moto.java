public class Moto extends Veiculo{
     String tipo;
public void acelerar(){
    System.out.format("A %s %s está começando a se mover\n", marca, modelo);
}
public void empinar(){
    System.out.format("A %s %s do tipo '%s' está empinando\n", marca, modelo, tipo);

}
}
