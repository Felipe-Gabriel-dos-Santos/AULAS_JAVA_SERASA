package utils.Layout;

import javax.swing.JOptionPane;

public class Layout {
    public static String Input(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }

    public static int InputInteger(String mensagem) {
        String valorString = Input(mensagem);
        
        return Integer.parseInt(valorString);
    }

    public static Float InputFloat(String mensagem) {
        String valorString = Input(mensagem);
        
        return Float.parseFloat(valorString);
    }

    public static void Output(Object valor) {
        JOptionPane.showMessageDialog(null, valor, "O valor retornado foi: ", 0, null);
    }
}