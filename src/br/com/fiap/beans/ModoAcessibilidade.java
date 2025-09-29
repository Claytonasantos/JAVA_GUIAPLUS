package br.com.fiap.beans;

public class ModoAcessibilidade {
    private String modoAcessibilidade;

    public ModoAcessibilidade() {
    }

    public ModoAcessibilidade(String modoAcessibilidade) {
        this.modoAcessibilidade = modoAcessibilidade;
    }

    public String getModoAcessibilidade() {
        return modoAcessibilidade;
    }

    public void setModoAcessibilidade(String modoAcessibilidade) {
        this.modoAcessibilidade = modoAcessibilidade;
    }

    @Override
    public String toString() {
        return "\n\nModo de acessibilidade" +
                "\nModo: " + modoAcessibilidade
                ;
    }
}
