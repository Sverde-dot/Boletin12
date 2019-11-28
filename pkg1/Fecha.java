/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12.pkg1;

/**
 *
 * @author sverdecadilla
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anho;

    public Fecha(int dia, int mes, int anho) {
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnho() {
        return anho;
    }

    public void setDia(int dia) {
        if(anho%400==0||(anho%100!=0&&anho%4==0)){
            if(mes==2 && dia==29 && dia>0);
            this.dia = dia;
        }
        else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12 && dia>0 &&dia==31){
            this.dia = dia;
        }
        else if(dia<0 && dia>=30)
            this.dia = dia;
    }

    public void setMes(int mes) {
        if(anho%400==0||(anho%100!=0&&anho%4==0)){
            if(mes==2 && dia==29 && dia>0);
            this.mes = mes;
        }
        else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12 && dia>0 &&dia==31){
            this.mes = mes;
        }
        else if(dia<0 && dia>=30)
            this.mes = mes;
    }

    public void setAnho(int anho) {
        if(anho%400==0||(anho%100!=0&&anho%4==0)){
            if(mes==2 && dia==29 && dia>0);
            this.anho = anho;
        }
        else if(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12 && dia>0 &&dia==31){
            this.anho = anho;
        }
        else if(dia<0 && dia>=30)
            this.anho = anho;
    }
    
    
    
}
