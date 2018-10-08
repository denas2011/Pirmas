package lt.kaunascoding;

import java.util.Scanner;

public class Main {
//    public static final int MASYVO_ILGIS = 5;

    public static void main(String[] args) {



//     1.5   System.out.println("Iveskite "+MASYVO_ILGIS+" skaicius");
//        Scanner sc = new Scanner(System.in);
//        int[]skaiciai = new int[MASYVO_ILGIS];
//        int suma = 0;
//        for (int i = 0; i <skaiciai.length; i++){
//
//            skaiciai[i] = sc.nextInt();
//            suma += skaiciai[i];
//
//        }
//        System.out.println("Suma yra: "+suma);
//        for (int i = 0; i <skaiciai.length; i++){
//            System.out.print(skaiciai[i] + " ");
//        }


//      1.6  System.out.println("Iveskite "+MASYVO_ILGIS+" zodzius");
//        Scanner sc = new Scanner(System.in);
//        String []zodis = new String[MASYVO_ILGIS];
//
//        for(int i = 0; i<zodis.length;i++){
//
//            zodis[i] = sc.nextLine();
//        }
//
//        for (int i = 0; i<zodis.length;i++){
//            System.out.print(zodis[i] + " ");
//        }



        Scanner sc = new Scanner(System.in);
        String eilute = "";

        boolean arPavyko = true;
        do{
            try {
                System.out.println("Iveskite skaiciu");
                eilute = sc.nextLine();
                float b = Float.parseFloat(eilute);
                System.out.println(b);
                arPavyko = true;
                float a = (int) b;
                System.out.println(a);
                System.out.println(b);
                if (a == b) {
                    System.out.println("Sveikas");
                } else {
                    System.out.println("Su kableliu");
                }
            }catch (Exception klaidosObijektas){
                System.out.println("Ivestas ne skaicius, kartokite ivedima");
                arPavyko = false;
            }
        }while (!arPavyko);
        
       System.out.println("Labas")
    }

}
