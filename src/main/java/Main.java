import java.util.Scanner;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        /*intToString();
        hundredModulo ();
        printInputText ();
        reverseText("abcdefg");
        reverseArray ();
        splitTextToArray("Hallo, Wolrd,! abc,def");*/
        getQuersumme(15021);



    }
// Intermediate
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

    public static void printInputText () {
    /*
    Intermediate-Aufgabe 3:
    Schreibe ein Programm die Wörter vom Benutzer einliest (Scanner) und diese in einem Array speichert.
    Gib vor jeder Eingabe jeweils die eingegebenen Wörter noch mal aus.
    */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte Wörter eingeben:");
    String text = scanner.nextLine();
    String [] textListe = {text};
    System.out.println(text);
    }

// Expert
    public static void reverseText (String text) {
    /*
    Expert-Aufgabe 1:
    Schreibe eine Methode die einen Eingabestring rückwärts ausgibt.
    */
        String result = "";
        for (int i = text.length()-1; i >= 0; i--) {
            result += String.valueOf(text.charAt(i));
        }
        System.out.println(result);
    }

    public static void reverseArray () {
    /*
    Expert-Aufgabe 2:
    Gibt den folgenden Array aufsteigend sortiert aus: {6, 2, 8, 3, 9, 6}
    */
        int [] array = {6, 2, 8, 3, 9, 6};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void splitTextToArray (String text) {
    /*
    Schreibe eine Methode die einen String nach , separiert und als Array zurück gibt.
     */
        System.out.println(Arrays.toString(text.split(",")));
    }

    public static int getQuersumme (int number) {
    /*
    Schreibe eine Methode die Quersumme einer Ganzzahl berechnet.
     */
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        System.out.println(sum);
        return sum;
    }

    public static String numberToRoman (int number) {
    /*
    Gib eine Ganzzahl (1-100) als römische Zahl aus (12 = XII)
     */


    }




}