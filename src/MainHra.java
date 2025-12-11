import java.util.Scanner;

public class MainHra {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Hra hra = new Hra();
        hra.pridatMesta();
        hra.shuffle();
        hra.zadatMesto();
        hra.check();

    }
}