public class Main{
    public static void main(String[] args) {
        var carro = new Carro();
        carro.modelo = "3008";
        carro.marca = "Peugeot";
        carro.ano = 2023;
        carro.quantidadeDePortas = 4;

        var Moto = new Moto();
        Moto.modelo = "S1000RR";
        Moto.marca = "BMW";
        Moto.ano = 2022;
        Moto.tipo = "Esportiva";

        carro.acelerar();
        Moto.acelerar();
        carro.abrirPorta();
        Moto.empinar();
        }
    }