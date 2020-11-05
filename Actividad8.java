package actividadesjava.Actividad8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Actividad8 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Deck deck = new Deck();
        int opc;
        String reapeat;
        do {
            System.out.println("Bienvenido al juego de  Poker \nSeleccione alguna de nuestras opciones");
            System.out.println("1) Mezclar deck\n2) Retirar una carta  \n3) Sacar una carta al azar \n4) Generar una mano de 5 cartas\n5) salir");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Mezclar deck");
                    deck.shuffle();
                    break;
                case 2:
                    System.out.println("Retirar  una carta");
                    deck.head();
                    break;
                case 3:
                    System.out.println("Sacar una carta al azar");
                    deck.pick();
                    break;
                case 4:
                    System.out.println("Mano de 5 cartas");
                    System.out.println(deck.hand().toString());
                    break;
                case 0:
                    System.out.println("Gracias por jugar");
                    System.exit(opc);
                    break;
            }
            System.out.println("Desea repetir el menu ?\n (1) SI / (2) No");
            reapeat = lector.readLine();
        } while (reapeat.equals("1"));

    }
}
