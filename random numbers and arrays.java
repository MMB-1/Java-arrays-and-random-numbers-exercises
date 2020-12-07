import java.util.Random;
import java.util.Scanner;

public class zad5 {
    public static void main (String [] args)
    {
        int[][] tab_mnozenia = new int[10][10];
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                tab_mnozenia[i][j]=(i+1)*(j+1);
                System.out.print(tab_mnozenia[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        int[][] dziesiec_na_piec = new int[10][5];
        Random losowy = new Random();
        int suma_greatest=0;
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<5;j++)
            {
                dziesiec_na_piec[i][j]=losowy.nextInt(20);
                System.out.print(dziesiec_na_piec[i][j] + " ");
            }
            int suma=0;
            for (int j=0;j<5;j++)
            {
                suma+=dziesiec_na_piec[i][j];
            }
            if (suma>suma_greatest)
            {
                suma_greatest=suma;
            }
            System.out.print("Suma: " + suma);

            System.out.println();

        }
        System.out.println();
        System.out.println("Największa suma: " + suma_greatest);
        System.out.println();

        double[][] tab_double = new double[10][10];
        double range_start = -5;
        double range_end=5;
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                double r1 = losowy.nextDouble();
                double r2 = range_start + (r1 * (range_end - range_start));
                tab_double[i][j] = r2;
                System.out.print(r2 + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Czy wyzerować liczby dodatnie, czy ujemne? Naciśnij + lub -");
        Scanner odczyt = new Scanner(System.in);
        char znak = odczyt.nextLine().charAt(0);
        System.out.println();
        if (znak == '+')
        {
            for (int i=0;i<10;i++)
            {
                for (int j=0;j<10;j++)
                {
                    if(tab_double[i][j] > 0)
                    {
                        tab_double[i][j]=0;
                    }
                    System.out.print(tab_double[i][j] + " ");
                }
                System.out.println();
            }

        }
        else
        {
            for (int i=0;i<10;i++)
            {
                for (int j=0;j<10;j++)
                {
                    if(tab_double[i][j] < 0)
                    {
                        tab_double[i][j]=0;
                    }
                    System.out.print(tab_double[i][j]+ " ");
                }
                System.out.println();
            }

        }


        double srednia_pierwszej_tablicy=0;
        int suma_przekatnej=0;
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                srednia_pierwszej_tablicy+=tab_mnozenia[i][j];

                if (i==j)
                {
                    suma_przekatnej+=tab_mnozenia[i][j];

                }

            }


        }
        srednia_pierwszej_tablicy=srednia_pierwszej_tablicy/100;
        System.out.println();
        System.out.println("Srednia tablicy z tabliczką mnożenia: " + srednia_pierwszej_tablicy);
        System.out.println("Suma na przekątnej: " + suma_przekatnej);
    }






}
