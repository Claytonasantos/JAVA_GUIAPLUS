package br.com.fiap.beans;

public class Tutorial_texto {
    private String textoTutorial;
    private CategoriaTutorial categoriaTexto;

    public Tutorial_texto() {
    }

    public Tutorial_texto(String textoTutorial) {
        this.textoTutorial = textoTutorial;
    }

    public String getTextoTutorial() {
        return textoTutorial;
    }

    public void setTextoTutorial(String textoTutorial) {
        this.textoTutorial = textoTutorial;
    }

    public CategoriaTutorial getCategoriaTexto() {
        return categoriaTexto;
    }

    public void setCategoriaTexto(CategoriaTutorial categoriaTexto) {
        this.categoriaTexto = categoriaTexto;
    }

    @Override
    public String toString() {
        return "\n\nTutorial em Texto" +
                "\nTutorial em Texto: " + textoTutorial
                ;
    }
}
