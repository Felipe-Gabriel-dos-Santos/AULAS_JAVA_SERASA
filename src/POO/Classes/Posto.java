package POO.Classes;

public class Posto {
    private static float precoPorLitro = 4.45f;
    private static float precoNaBomba = 0.0f;

    private static int quantidadeAbastecidaLitros = 0;

    public static void EncheTanque(float precoQueDesejaPagar, Carro carro) throws Exception {
       ResetaBomba();

       while (precoNaBomba <= precoQueDesejaPagar) {
        carro.tanque.Encher(1);
        quantidadeAbastecidaLitros += 1;
        precoNaBomba += precoPorLitro;

        if (quantidadeAbastecidaLitros > carro.tanque.RetornaQuantidadeMaximaTanque()) {
            throw new Exception("O tanque transbordou!!!!!!!!!!!!!!!!!!");
        }
       }
     }

     private static void ResetaBomba() {
        precoNaBomba = 0.0f;
        quantidadeAbastecidaLitros = 0;
     }
}
