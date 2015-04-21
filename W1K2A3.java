/*
Lege zwei Variablen vom Typ int an. Eine der beiden Variablen soll a heißen und den Wert 4 haben, die andere soll b heißen und den Wert 7 haben. Berechne anschließend das Ergebnis von (a+b)² und speichere es in der int Variable c. Gebe das Ergebnis c aus. Lege eine Variable vom Typ String mit dem Namen ergebnis an. Der Wert von ergebnis soll “Das Ergebnis ist: “ verknüpft mit dem Wert von c sein. Gebe ergebnis aus.

*/

public class W1K2A3 {
    public static void main(String[]args){
        int a = 4;
        int b = 7;
        double c = Math.pow((a+b),2);
        String ergebnis = "Das Ergebnis ist: " + c;
        System.out.println(ergebnis);
    }
}

