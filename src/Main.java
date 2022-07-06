import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //Der Scanner ist dazu da, um es möglich zu machen, in die Konsole zu schreiben, damit der Spieler seinen Zug machen kann
            while (true) {
                String[] scheresteinpapier = {"schere", "stein", "papier"};
                String computerZug = scheresteinpapier[new Random().nextInt(scheresteinpapier.length)]; /* Hier wird der Computerzug generiert, welche uns eine
                Zufallszahl zwischen 0, 1 & 2 gibt */
                String spielerZug;

                while (true) {
                    System.out.println("Beginne mit deinem Zug! (schere, stein oder papier)");
                    spielerZug = scanner.nextLine(); //Spielereingabe in der nächsten Zeile
                    if (spielerZug.equals("schere") || spielerZug.equals("stein") || spielerZug.equals("papier")) {
                        break; //Hier wird überprüft, ob der Spieler eine gültige Eingabe eingebeben hat. Falls nicht, beginnt das Programm von vorne.
                    }
                    System.out.println(spielerZug + " ist eine ungültige Eingabe.");
                }

                System.out.println("Computer Zug: " + computerZug);
                if (spielerZug.equals(computerZug)) {
                    System.out.println("Es resultierte ein Untentschieden!");

                } else if (spielerZug.equals("schere")) {
                    if (computerZug.equals("stein")) {
                        System.out.println("Du hast verloren!");
                    } else if (computerZug.equals("papier")) {
                        System.out.println("Du hast gewonnen!");
                    }
                } else if (spielerZug.equals("stein")) {
                    if (computerZug.equals("papier")) {
                        System.out.println("Du hast verloren!");
                    } else if (computerZug.equals("schere")) {
                        System.out.println("Du hast gewonnen!");
                    }
                } else if (spielerZug.equals("papier")) {
                    if (computerZug.equals("schere")) {
                        System.out.println("Du hast verloren!");
                    } else if (computerZug.equals("stein")) {
                        System.out.println("Du hast gewonnen!");
                    }
                }
                System.out.println("Willst du noch eine Runde spielen? (j/n)");
                String erneutSpielen = scanner.nextLine();

                if (!erneutSpielen.equals("j")) {
                    break; //Sobald eine andere Antwort als j eingegeben wird, ist das Programm beendet.
                }
            }
    }
}
