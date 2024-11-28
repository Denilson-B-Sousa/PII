package lista03.exercicio05;

import java.time.LocalDate;
import java.time.Month;

public class Datas {

    public int dia;
    public int mes;
    public int ano;

    public Datas(int dia, int mes, int ano) {

        if(dia < 1 || dia > Month.of(mes).length(isAnoBissexto(ano))){
            throw new IllegalArgumentException("O dia é inválido para o mês e ano informado!");
        }

        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("O mês informado é inválido!");
        }

        int anoAtual = LocalDate.now().getYear();

        if(ano > anoAtual){
            throw new IllegalArgumentException("O ano informado é inválido!");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public Datas() {

        this.ano = LocalDate.now().getYear();
        this.mes = LocalDate.now().getMonthValue();
        this.dia = LocalDate.now().getDayOfMonth();

    }

    private boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    public int proximoDia() {
        return this.dia++;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {

        if(dia < 1 || dia > Month.of(mes).length(isAnoBissexto(ano))){
            throw new IllegalArgumentException("O dia é inválido para o mês e ano informado!");
        }

        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("O mês informado é inválido!");
        }

        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data: { " +
                 dia + "/" +
                 mes + "/" +
                 ano +
                " }";
    }
}
