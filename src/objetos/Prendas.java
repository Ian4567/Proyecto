/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author DAW-11
 */
public class Prendas {

    private String tipoPrenda;
    private String temporada;
    private String referencia;
    private String color;
    private double pvp;

    public Prendas(String tipoPrenda, String temporada, String referencia, String color, double pvp) {
        this.tipoPrenda = tipoPrenda;
        this.temporada = temporada;
        this.referencia = referencia;
        this.color = color;
        this.pvp = pvp;
    }

    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public void setTipoPrenda(String tipoPrenda) {
        this.tipoPrenda = tipoPrenda;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public void modificarPvp() {

    }
}
