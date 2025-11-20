import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Hra hra = new Hra();
        hra.pridatMesta();
        hra.shuffle();
        hra.zadatMesto();
        hra.check();

    }
}