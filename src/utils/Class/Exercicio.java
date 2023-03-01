package utils.Class;

import java.util.concurrent.Callable;

public class Exercicio {
    private String questao;
    private Callable<String> resolucao; 

    public String getResolucao() {
        try {
            return resolucao.call();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao executar resolução do exercício!: " + ex.getMessage(), ex);
        }
    }

    public void setResolucao(Callable<String> resolucao) {
        this.resolucao = resolucao;
    }

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

}
