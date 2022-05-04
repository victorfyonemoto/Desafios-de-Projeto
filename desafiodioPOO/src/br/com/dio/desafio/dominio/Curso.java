package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXP() {
        return xpPadrao * cargaHoraria;
    }

    private int cargaHoraria;


    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}