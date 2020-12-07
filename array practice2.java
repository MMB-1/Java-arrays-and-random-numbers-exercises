import java.util.Scanner;
import java.util.Random;

public class zad7 {
    public static void main (String [] args)
    {
        //podpunkt a

        int[][] tab1 = new int[4][4];
        int[][] tab2 = new int[4][4];

        System.out.println("Podaj x do przedziału <0, x>, z którego mają być losowane wartości do tablicy 1.");
        Scanner odczyt = new Scanner(System.in);
        int limit1 = odczyt.nextInt();
        System.out.println("Podaj x do przedziału <0, x>, z którego mają być losowane wartości do tablicy 2.");
        int limit2 = odczyt.nextInt();
        Random losowy = new Random();
        for (int i=0;i< tab1.length;i++)
        {
            for (int j=0;j<tab1[i].length;j++)
            {
                tab1[i][j] = losowy.nextInt(limit1);
                System.out.print(tab1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0;i< tab2.length;i++)
        {
            for (int j=0;j<tab2[i].length;j++)
            {
                tab2[i][j] = losowy.nextInt(limit2);
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] tab3 = new int[4][4];
        System.out.println();
        System.out.println("Suma macierzowa:");
        System.out.println();
        for (int i=0;i< tab3.length;i++)
        {
            for (int j=0;j<tab3[i].length;j++)
            {
                tab3[i][j] = tab1[i][j] + tab2[i][j];
                System.out.print(tab3[i][j] + " ");
            }
            System.out.println();
        }

        //podpunkt b
        System.out.println();
        System.out.println("Podaj rozmiar n dla tablicy kwadratowej nxn.");
        int rozmiar = odczyt.nextInt();
        char[][] tabLiter =new char[rozmiar][rozmiar];
        StringBuilder builderSamoglosowki = new StringBuilder();
        StringBuilder builderSpolgloski = new StringBuilder();

        for (int i=0;i< tabLiter.length;i++)
        {
            for (int j=0;j<tabLiter[i].length;j++)
            {
                int ascii=losowy.nextInt(25) +97;
                char asciichar =(char)ascii;
                tabLiter[i][j] = asciichar;
                System.out.print(tabLiter[i][j] + " ");
                if (ascii == 97 || ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117 || ascii == 121)
                {
                    builderSamoglosowki.append(asciichar);

                }
                else
                {
                    builderSpolgloski.append(asciichar);

                }


            }
            System.out.println();
        }
        System.out.println();
        String samogloski = builderSamoglosowki.toString();
        System.out.println(samogloski);
        String spolgloski = builderSpolgloski.toString();
        System.out.println(spolgloski);

        //podpunkt c

        System.out.println();
        System.out.println("Podaj rozmiar n dla tablicy nx10.");
        int rozmiar2 = odczyt.nextInt();
        char[][] tabLiter2 =new char[rozmiar2][10];
        System.out.println("Podaj łańcuch znaków o minimalnie 16 literach.");
        Scanner newodczyt = new Scanner(System.in);
        String string = newodczyt.nextLine();
        int stringcounter =0;
        for (int i=0;i< tabLiter2.length;i++)
        {
            for (int j=0;j<tabLiter2[i].length;j++)
            {
                if (stringcounter<string.length())
                {
                    tabLiter2[i][j] = string.charAt(stringcounter);
                    stringcounter++;
                    System.out.print(tabLiter2[i][j] + " ");
                }
                else
                {
                    tabLiter2[i][j]='0';
                    System.out.print(tabLiter2[i][j] + " ");
                }


            }
            System.out.println();
        }

        //podpunkt d
        System.out.println();
        double[][] tab4 = new double[4][4];
        double[][] tab5 = new double[4][4];
        System.out.println("Podaj początek przedziału dla tablicy1.");
        int range_start1 = odczyt.nextInt();
        System.out.println("Podaj koniec przedziału dla tablicy1.");
        int range_end1 = odczyt.nextInt();
        System.out.println("Podaj początek przedziału dla tablicy2.");
        int range_start2 = odczyt.nextInt();
        System.out.println("Podaj koniec przedziału dla tablicy2.");
        int range_end2 = odczyt.nextInt();


        for (int i =0;i< tab4.length;i++)
        {
            for (int j=0;j<tab4[i].length;j++)
            {
                double r1 = losowy.nextDouble();
                double r2 = range_start1 + (r1 * (range_end1 - range_start1));
                tab4[i][j]=r2;
                System.out.print(r2 + " ");

            }
            System.out.println();

        }
        System.out.println();
        for (int i =0;i< tab5.length;i++)
        {
            for (int j=0;j<tab5[i].length;j++)
            {
                double r1 = losowy.nextDouble();
                double r2 = range_start2 + (r1 * (range_end2 - range_start2));
                tab5[i][j]=r2;
                System.out.print(r2 + " ");

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("Suma macierzowa (dzielenie):");
        double[][] tab6 = new double[4][4];
        System.out.println();
        for (int i=0;i< tab6.length;i++)
        {
            for (int j=0;j<tab6[i].length;j++)
            {
                tab6[i][j] = tab4[i][j] / tab5[i][j];
                System.out.print(tab6[i][j] + " ");
            }
            System.out.println();
        }



    }
}
