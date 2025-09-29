package br.com.fiap.beans;

public class Suporte {
    private String pergunta;

    public Suporte() {
    }

    public Suporte(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    @Override
    public String toString() {
        return "\n\nSuporte" +
                "\npergunta: " + pergunta
                ;
    }

    public void duvidaConfirmada() {
        System.out.println("Sua dúvida foi registrada com sucesso!");
    }

    public void recebimentoResposta() {
        System.out.println("Recebemos a pergunta: " + pergunta);
        System.out.println("Nossa equipe irá analisar e responder em breve.");
    }

}
