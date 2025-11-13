import java.util.ArrayList;

public class Hra {
    private ArrayList<String> mesta = new ArrayList<String>();


    public Hra() {
    }


    public void pridatMesta() {
        mesta.add("Enaden");
        mesta.add("Neriaden");
        mesta.add("Neaonisa");
        mesta.add("Praha");
        mesta.add("Plzeň");
        mesta.add("Brno");
    }

    public void shuffle(){
        String mesto =  mesta.get((int) (Math.random() * mesta.size()));
        for(int i=0;i < 100;i++){
            int a = (int) Math.round(Math.random() * mesto.length());
            int b = (int) Math.round(Math.random() * mesto.length());
            if (a > b){
                int a2 = a;
                int b2 = b;
            }else{
                int a2 = b;
                int b2 = a;
            }


           mesto = mesto.substring(a, b);

        }

    }


}
