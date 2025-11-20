import java.util.ArrayList;
import java.util.Scanner;

public class Hra {
    static Scanner sc = new Scanner(System.in);
        private String mesto;
        private String mestoCast;
        private String mestoZbytek;
        private String puvodniMesto;
        private String odpoved;
        private int a2;
        private int b2;
        private boolean stejne = true;

        private ArrayList<String> mesta = new ArrayList<String>();

        public Hra() {
          }

       public void pridatMesta() {
          //mesta.add("Enaden");
          //mesta.add("Neriaden");
          //mesta.add("Neaonisa");
           mesta.add("Praha");
           mesta.add("Plzeň");
           mesta.add("Brno");
           mesta.add("Olomouc");
           mesta.add("Most");
           mesta.add("Kladno");
       }

       public String shuffle(){
           mesto =  mesta.get((int) (Math.random() * mesta.size()));
           puvodniMesto = mesto;
           for(int i=0;i < 1000 && stejne==true;i++){
               int a = (int) (Math.random() * mesto.length());
               int b = (int) (Math.random() * mesto.length());
               if (a == b) continue;
               a2 = Math.min(a, b);
               b2 = Math.max(a, b);

               mestoCast = mesto.substring(a2, b2);
               mestoZbytek = mesto.substring(0, a2) + mesto.substring(b2);
               mesto = mestoZbytek + mestoCast;

               if(mesto.equals(puvodniMesto)){
                   stejne = true;
               }else{
                   stejne = false;
               }


           }
           return mesto;
       }

       public String zadatMesto(){
           System.out.println("Jaké je to město?");
           System.out.println(mesto.toUpperCase());
           odpoved = sc.nextLine();
           return odpoved;
       }

       public void check(){
            if(puvodniMesto.equals(odpoved.toUpperCase())){
                System.out.println("SPRÁVNĚĚĚ!!!");
            }else {
                System.out.println("ŠPATNĚĚĚ!!!");
            }
       }

}
