public class Aufgabe2_1810653748
{
    public static void main (String[]args)
    {
        String name="Sabrina";      //Zeichenkette in Anführungszeichen
        int alter=25;               //braucht immer eine ganze Zahl, dazu brauch ich keine Anführungszeichen, -Zahlen zwischen -2147483648 und 2147483647 (32 Bit)
        double kommastelle=2.7;     //mit double kann ich auch eine Zahl mit Kommastelle angeben, -Fließkommawert nach IEEE 754 zwischen ca. 4.9E-324 und 1.8E308 (Doppelte Genauigkeit, 64 Bit)
        boolean wahrheitswert=true; //wird der Wahrheitswert berechnet, entweder true oder false
        long ganzeZahlen= -34345345; //nur ganze Zahlen zwischen -9223372036854775808 und 9223372036854775807 (64 Bit)
        char einzelneZeichen= '\uffff'; //Einzelne Zeichen des Unicode-Zeichensatzes zwischen '\u0000' und '\uffff' (16 Bit)
        byte ganzeZahlen1=7;           // nur ganze Zahlen zwischen -128 und 127 (8 Bit)
        short ganzeZahlen2=-18796;      //nur ganze Zahlen zwischen -32768 und 32767 (16 Bit)
        float fliesskommawert= 23.345f;    //Fließkommawert nach IEEE 754 zwischen ca. 1.4E-45 und 3.4E38 (Einfache Genauigkeit, 32 Bit)
        final int zahl= 218;            // Variablen kann man nach belieben ändern und mit dem Wort final vor dem der Variablen in eine Konstante umändern, die danach nicht mehr geändert werden kann

    }
}
