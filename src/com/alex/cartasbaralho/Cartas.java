package com.alex.cartasbaralho;

//Classe Card representa uma carta de baralho.
/**
 *
 * @author ph756
 */
public class Cartas {

    private String face; //face da carta ("A", "Dois", ...)
    private String naipe; //naipe da carta ("Coração", "Paus", ...)

    // construtor de dois argumentos inicializa face e naipe da carta
    public Cartas(String face, String naip) {

        this.face = face;
        this.naipe = naip;
    }

    public String toString() {
        return face + " de " + naipe;
    }

}
