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
public class Chic extends Prendas {

    private String tejido;
    private double largura;

    public Chic() {
        super();
        this.tejido = "";
        this.largura = 0;
    }

    public Chic(String tejido, double largura, String tipoPrenda, String temporada, String referencia, String color, double pvp) {
        super(tipoPrenda, temporada, referencia, color, pvp);
        this.tejido = tejido;
        this.largura = largura;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void mostrarDatos() {
        super.mostrarPrendas();
        System.out.println("Tejido: " + tejido);
        System.out.println("Largura: " + largura + "m");
    }

    public String modelo() {
        String largo = "";
        if (largura > 1.5) {
            largo = "Largo";
        } else if (largura > 1 && largura <= 1.5) {
            largo = "Tres cuartos";
        } else {
            largo = "Corto";
        }

        return largo;

    }

}
