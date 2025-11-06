import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


//1----------
    /*
        System.out.println("Zadej jmeno");
        String jmeno = sc.nextLine();
        jmeno = jmeno.trim();

        jmeno = jmeno.substring(0,1).toUpperCase() + jmeno.substring(1, jmeno.indexOf(" ")).toLowerCase() + jmeno.substring(jmeno.indexOf(" "), jmeno.indexOf(" ")+2).toUpperCase() + jmeno.substring(jmeno.indexOf(" ")+2, jmeno.length()).toLowerCase()      ;

        System.out.println(jmeno);
    */

//2----------
    /*
        System.out.println("Zadej text");
        String text = sc.nextLine();

        int  pocetMezer = 0;
        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) == ' ') {
                pocetMezer++;
            }
        }
        System.out.println(pocetMezer);
    */

//3----------
    /*
        System.out.println("Zadej slovo");
        String slovo = sc.nextLine();
        char zacatek = slovo.charAt(0);
        char konec = slovo.charAt(slovo.length() - 1);
        System.out.println("Začíná na -" +zacatek+ "- A končí na -" +konec+ "-");
    */

//4----------
        System.out.println("Zadej text");
        String text = sc.nextLine();
        System.out.println("Zadej slovo které chceš vyhledat");
        String slovo = sc.nextLine();

        int pocet =0;
        int index = text.indexOf(slovo);

        do {
            pocet++;
            System.out.println(" - pozice " + index);
            index = text.indexOf(slovo, index+1);
        }while(index != -1);
        System.out.println("našel jsem to "+pocet+" krát");













    }
}