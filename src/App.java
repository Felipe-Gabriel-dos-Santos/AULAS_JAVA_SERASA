import EstruturaDados.ArrayExemplos;
import EstruturaDados.EnumExemplos;
import POO.Classes.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        carro.ligar();
        carro.andar();

        EnumExemplos.ExibeValoresEnum();
        ArrayExemplos.GeraArrayComInteirosAleatorios(10);
    }
}
