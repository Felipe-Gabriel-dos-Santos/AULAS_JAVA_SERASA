package utils.Layout;

import javax.swing.JOptionPane;

public class Layout {
    public static String Input(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static int InputInteger(String mensagem) {
        String valorString = Input(mensagem);
        int valor = 0;
        try {
            valor = Integer.parseInt(valorString);
            
        } catch (NumberFormatException e) {
            Output("Valor inválido! Insira um número inteiro válido.");
            valor = InputInteger(mensagem);
        }

        return valor;
    }

    public static Float InputFloat(String mensagem) {
        String valorString = Input(mensagem);
        float valor = 0.0f;
        try {
            valor = Float.parseFloat(valorString); 
        } catch (NumberFormatException e) {
            Output("Valor inválido! Insira um número real válido.");
            valor = InputFloat(mensagem);
        }
        return valor;
    }

    public static void Output(Object valor) {
        JOptionPane.showMessageDialog(null, valor, "O valor retornado foi: ", 0, null);
    }
}