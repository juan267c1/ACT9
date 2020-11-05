
package actividadesjava.Actividad8;


import java.util.ArrayList;

public class Card {
    private ArrayList palo = new ArrayList();
    private ArrayList color = new ArrayList();
    private ArrayList valor = new ArrayList();

    public Card(){
        palo.add("treboles");
        palo.add("corazones");
        palo.add("picas");
        palo.add("diamantes");
        color.add("rojo");
        color.add("negro");
        for(int i = 2; i <= 10 ; i ++){
            valor.add(i);
        }
        valor.add('A');
        valor.add('J');
        valor.add('Q');
        valor.add('K');
    }
    public ArrayList getPalo() {
        return palo;
    }
    public ArrayList getColor() {
        return color;
    }
    public ArrayList getValor() {
        return valor;
    }
}
