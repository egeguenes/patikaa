import java.util.Scanner;

public class EkokEbob{
    public static void main(String[] args){
        int zahl1, zahl2, ebob, ekok;
        Scanner ant = new Scanner(System.in);
        System.out.println("Sayilari girin : ");
        zahl1 = ant.nextInt();
        zahl2 = ant.nextInt();
        int i = 1;
        int c = 1;
        ebob = 0;
        ekok = 0;
        if (zahl1>zahl2){
            boolean esek = true;
            while (esek){
                i++;
                if (zahl1%i==0 && zahl1%i==0){
                    ebob = i;
                    esek = false;
                    ekok = (zahl1*zahl2) / ebob;
                    break;
                }
            }
        } else if (zahl1<zahl2){
            boolean esek = true;
            while (esek){
                i++;
                if (zahl1%i==0 && zahl1%i==0){
                    ebob = i;
                    esek = false;
                    ekok = (zahl1*zahl2) / ebob;
                    break;
                }
            }
        } else {
            ebob = i;
            ekok = zahl2;   
        } System.out.println(zahl1 + " ve " + zahl2 + " ebobu " + ebob + ", ekoku " + ekok);
    }
}
        //--------------------------------------------
        //Ekok:
        /*Scanner ant = new Scanner(System.in);
        System.out.println("Sayilari girin : ");
        int zahl1 = ant.nextInt();
        int zahl2 = ant.nextInt();
        int ekok = 0;
        for (int i=1; i<= zahl1*zahl2; i++){
            if (i%zahl1==0 && i%zahl2==0){
                ekok = i;
                break;
            }
        }
        System.out.println(ekok + " ist ekok von " + zahl1 + " " + zahl2);
        */
        //---------------------------------------------------------------
        //Ebob:
        /*Scanner input = new Scanner(System.in);
        int zahl1, zahl2, ebob;
        System.out.println("Sayilari girin : ");
        zahl1 = input.nextInt();
        zahl2 = input.nextInt();
        ebob = 0;
        if (zahl1<zahl2){
            for (int i = 1; zahl1>=i; i++){
                if (zahl1%i==0 && zahl2%i==0){
                    ebob = i;
                }
            }
        } else if (zahl1>zahl2){
            for (int i=1; zahl2>=i; i++){
                if (zahl1%i==0 && zahl2%i==0){
                    ebob = i;
                } 
            }
        } else {
            ebob = zahl1;
        } System.out.println(ebob);
        */