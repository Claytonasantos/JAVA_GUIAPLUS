package br.com.fiap.beans;

public class Tutorial_video {
    private String titulo;
    private String url;
    private CategoriaTutorial categoria;

    public Tutorial_video() {
    }

    public Tutorial_video(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CategoriaTutorial getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTutorial categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "\n\nTutorial em video" +
                "\nTitulo do video: " + titulo +
                "\nURL: " + url
                ;
    }
}
