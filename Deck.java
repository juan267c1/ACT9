package actividadesjava.Actividad8;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList deck = new ArrayList();
    public ArrayList handOfFive = new ArrayList();

    public Deck() {
        Card card = new Card();
        for (int i = 0; i < card.getPalo().size(); i++) {
            for (int k = 0; k < card.getValor().size(); k++) {
                if (card.getPalo().get(i) == "treboles") {
                    deck.add("{" + card.getPalo().get(i) + ", " + card.getColor().get(1) + ", " + card.getValor().get(k) + "}");
                }
                if (card.getPalo().get(i) == "picas") {
                    deck.add("{" + card.getPalo().get(i) + ", " + card.getColor().get(1) + ", " + card.getValor().get(k) + "}");
                }
                if (card.getPalo().get(i) == "corazones") {
                    deck.add("{" + card.getPalo().get(i) + ", " + card.getColor().get(0) + ", " + card.getValor().get(k) + "}");
                }
                if (card.getPalo().get(i) == "diamantes") {
                    deck.add("{" + card.getPalo().get(i) + ", " + card.getColor().get(0) + ", " + card.getValor().get(k) + "}");
                }

            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
        System.out.println("Se a mezclado el Deck");
    }

    public void head() {
        System.out.println(deck.get(0));
        deck.remove(0);
        System.out.println("Quedan " + deck.size() + " cartas en el deck.");
    }

    public void pick() {
        int range = (int) ((Math.random() * (deck.size() - 1)) + 1);
        System.out.println(deck.get(range));
        deck.remove(range);
        System.out.println("Quedan " + deck.size() + " cartas en el deck.");
    }

    public ArrayList hand() {
        for (int i = 0; i < 5; i++) {
            handOfFive.add(deck.get(0));
            deck.remove(0);
        }
        System.out.println("Se retiraron 5 cartas y ahora quedan " + deck.size() + " cartas en el deck.");
        return handOfFive;
    }

}
