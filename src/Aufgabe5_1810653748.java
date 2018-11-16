public class Aufgabe5_1810653748
{
    public static void main (String []args)
    {
        int zahl1= 7;
        int zahl2= 10;
        System.out.println(zahl1++);
        System.out.println(zahl2++);
        System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(++zahl1);
        System.out.println(++zahl2);

        /* bei 'Zahl++' wird die Zahl erst bei der nächsten Ausgabe um eines erhöht,
           bei '++Zahl' wird die Zahl sofort um eines erhöht, bei diesem Bsp. um zwei
           da wir davor schon eines dazugegebn haben*/
    }
}
