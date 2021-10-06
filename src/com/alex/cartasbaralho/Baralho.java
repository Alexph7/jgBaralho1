package com.alex.cartasbaralho;

import java.security.SecureRandom;

/**
 *
 * @author alexph7
 */
// classe DeckOfCards representa um baralho.
public class Baralho {

    private Cartas[] pacote;
    private int cartaCorrente;
    private final SecureRandom randomNum = new SecureRandom();

    public Baralho() {
        String[] faces = {"Az", "Dois", "Tres", "Quatro", "Cinco", "Seis", "Sete",
            "Oito", "Nove", "Dez", "Jack", "Rainha", "Rei"};

        String[] naipes = {"Copas", "Paus", "Ouros", "Espada"};

        pacote = new Cartas[52]; // cria array de objetos Card

        cartaCorrente = 0; // a primeira Carta distribuída será o pacote[0]

        for (int i = 0; i < pacote.length; i++) {
            pacote[i] = new Cartas(faces[i % 13], naipes[i / 13]);
        }
    }

// embaralha as cartas com um algoritmo de uma passagem
    public void embaralhar() {

        cartaCorrente = 0; // a próxima chamada para o método idealCarta deve começar no pacote[0] novamente

        // para cada Carta, seleciona outra Carta aleatória (0-51) e as compara
        for (int primeira = 0; primeira < pacote.length; primeira++) {
            int segundaJog = randomNum.nextInt(52);

            // compara Card atual com Card aleatoriamente selecionada
            Cartas temp = pacote[primeira];
            pacote[primeira] = pacote[segundaJog];
            pacote[segundaJog] = temp;

        }
    }

    public Cartas cartaIdeal() {   // distribui uma Carta

        if (cartaCorrente < pacote.length) {  // determina se ainda há Cards a serem distribuídas
            return pacote[cartaCorrente++];  // retorna Card atual no array
        } else {
            return null; // retorna nulo para indicar que todos as Cards foram distribuídas
        }
    }
}   // fim da classe DeckOfCards
