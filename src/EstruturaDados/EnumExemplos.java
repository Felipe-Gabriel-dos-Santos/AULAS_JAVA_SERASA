package EstruturaDados;

import utils.Layout.Layout;

public class EnumExemplos {

    public enum Turno {
        MANHA(1, "Manhã"),
        TARDE(2, "Tarde"),
        NOITE(3, "Noite");
        
        private final int codigo;
        private final String descricao; 
        
        Turno(int codigo, String descricao) {
            this.codigo = codigo;
            this.descricao = descricao;
        }
        
        public int getCodigo() {
            return codigo;
        }
        
        public String getDescricao() {
            return descricao;
        }
    }

    public static void ExibeValoresEnum() {
        for (Turno turno : Turno.values()) {
            Layout.Output(turno.getDescricao());
        }
    }
}
