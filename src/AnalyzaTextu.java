

public class AnalyzaTextu {
    private StringBuilder veta = new StringBuilder("Tato veta obsahuje 5 mezer XD");

    private int pocetPismen; //
    private int pocetVelkychPismen; //
    private int pocetMalychPismen; //
    private int pocetCislic;
    private int pocetSlov;
    private int pocetVet;

    public AnalyzaTextu() {}

    public void najdiPismena(){
        for (int i = 0; i < veta.length(); i++) {
            if (veta.charAt(i)!=' ' || veta.charAt(i)!='.' || veta.charAt(i)!='?' || veta.charAt(i)!=':' || veta.charAt(i)!='!') {
                pocetPismen++;

                if(Character.isUpperCase(veta.charAt(i))){
                    pocetVelkychPismen++;
                }else{
                    pocetMalychPismen++;
                }

            }
        }

    }

    public void najdiCisla(){
        for (int i = 0; i < veta.length(); i++) {
            if (veta.charAt(i) >= '0' && veta.charAt(i) <= '9') {
                pocetCislic++;

            }
        }

    }

























}
