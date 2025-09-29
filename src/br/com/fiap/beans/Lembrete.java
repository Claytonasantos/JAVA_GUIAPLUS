package br.com.fiap.beans;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lembrete {
    private String nome;
    private String descricaoLembrete;
    private String dataLembrete;


    public Lembrete() {
    }

    public Lembrete(String nome, String descricaoLembrete, String dataLembrete) {
        this.nome = nome;
        this.descricaoLembrete = descricaoLembrete;
        this.dataLembrete = dataLembrete;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoLembrete() {
        return descricaoLembrete;
    }

    public void setDescricaoLembrete(String descricaoLembrete) {
        this.descricaoLembrete = descricaoLembrete;
    }

    public String getDataLembrete() {
        return dataLembrete;
    }

    public void setDataLembrete(String dataLembrete) {
        this.dataLembrete = dataLembrete;
    }


    @Override
    public String toString() {
        return "\n\nLembrete" +
                "\nnome do lembrete: " + nome +
                "\nDescrição do lembrete: " + descricaoLembrete +
                "\nData do lembrete: " + dataLembrete
                ;
    }

    public void lembreteConfirmado() {
        System.out.println("Lembrete adicionado com sucesso!");
    }

}
