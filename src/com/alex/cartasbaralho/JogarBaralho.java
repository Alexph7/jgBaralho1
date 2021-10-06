package com.alex.cartasbaralho;

/**
 *
 * @author ph756
 */
public class JogarBaralho {

    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        baralho.embaralhar();

        // imprime todas as 52 cartas na ordem em que elas são distribuídas
        for (int i = 1; i <= 52; i++) {
            // distribui e exibe uma Card
            System.out.printf("%-19s", baralho.cartaIdeal());

            if (i % 4 == 0) // gera uma nova linha após cada quarta carta
            {
                System.out.println();

            }
        }
    }
}
