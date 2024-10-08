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

    public Prendas() {
        this.tipoPrenda = "";
        this.temporada = "";
        this.referencia = "";
        this.color = "";
        this.pvp = 0.0;
    }

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

    public void modificarPvp(double cantidad, String respuesta) {
        if (respuesta.equalsIgnoreCase("incrementar")) {
            this.pvp += cantidad;
        } else if (respuesta.equalsIgnoreCase("decrementar")) {
            this.pvp -= cantidad;
        } else {
            System.out.println("Respuesta no válida. Se espera 'incrementar' o 'decrementar'.");
        }
    }

    public void mostrarPrendas() {
        System.out.println("Tipo de prenda: " + tipoPrenda);
        System.out.println("Temporada: " + temporada);
        System.out.println("Referencia: " + referencia);
        System.out.println("Color: " + color);
        System.out.println("PVP: " + pvp + " €");
    }

    @Override
    public String toString() {
        return "Prendas{" + "tipoPrenda=" + tipoPrenda + ", temporada=" + temporada + ", referencia=" + referencia + ", color=" + color + ", pvp=" + pvp + '}';
    }

}
