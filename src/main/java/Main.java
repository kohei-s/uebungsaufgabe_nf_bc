public class Main {
    public static void main(String[] args) {
        intToString();
        hundredModulo ();


    }

    /*
    3. Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
    Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch
    */

    public static void intToString () {
        /*
        Intermediate-Aufgabe 1:
        Fülle ein String-Array mit den Zahlenwörtern "Eins" bis "Zehn"
        Schreibe eine Methode die zu einer einstelligen Zahl das entsprechende Zahlenwort ausgibt
        */

        String [] zahlenwoerter = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        for (int i = 0; i < zahlenwoerter.length; i++) {
            System.out.println((i + 1) + " = " + zahlenwoerter[i]);
        }
    }

    public static void hundredModulo () {
        /*
        Intermediate-Aufgabe 2:
        Schreibe ein Programm das die Zahlen 1-100 ausgibt, aber:
        Vor Zahlen die durch 3 teilbar sind (modulo) soll ein # stehen
        Vor Zahlen die durch 5 teilbar sind soll ein $ stehen
         */

        for (int i = 1; i < 101; i++) {
            if ((i % 3 ==0) && (i % 5 == 0)) {
                System.out.println("#" + "$" + i);
            } else if (i % 3 == 0) {
                System.out.println("#" + i);
            } else if (i % 5 == 0) {
                System.out.println("$" + i);
            } else {
                System.out.println(i);
            }
        }
    }




}

