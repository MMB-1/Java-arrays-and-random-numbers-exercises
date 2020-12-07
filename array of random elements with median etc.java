import java.util.*;

public class zad4 {
    public static void main (String [] args)
    {
        Random losowy = new Random();
        int n = losowy.nextInt(15); //limit 15
        double[] tab_double = new double[n];
        double range_start = -5;
        double range_end=5;
        System.out.println("Wylosowane liczby:");
        for (int i =0;i< tab_double.length;i++)
        {
            double r1 = losowy.nextDouble();
            double r2 = range_start + (r1 * (range_end - range_start));
            tab_double[i]=r2;
            System.out.println(r2);

        }
        System.out.println();
        OptionalDouble liczenie = Arrays.stream(tab_double).average();
        double sr = liczenie.getAsDouble();
        System.out.println("Srednia: " + sr);
        liczenie = Arrays.stream(tab_double).max();
        double max = liczenie.getAsDouble();
        System.out.println("Max: " + max);
        liczenie = Arrays.stream(tab_double).min();
        double min = liczenie.getAsDouble();
        System.out.println("Min: " + min);

        double mediana;
        Arrays.sort(tab_double);
        if (tab_double.length % 2 == 0) //jesli podzielne przez 2
        {
            double el1 = tab_double[(tab_double.length) / 2];
            double el2 = tab_double[((tab_double.length/2))-1];
            mediana = (el1+el2)/2;

        }
        else
        {
            mediana = tab_double[(int)tab_double.length/2];

        }
        System.out.println("Mediana: " + mediana);
        System.out.println();
        int[]zaokraglenie_do_calkowitych=new int[tab_double.length]; //zeby mozna bylo mowic o parzystych
        int ilosc_parzystych_niezerowych=0;
        System.out.println("Liczby zaokrąglone:");
        for (int i=0; i< zaokraglenie_do_calkowitych.length;i++)
        {
            zaokraglenie_do_calkowitych[i]=(int)tab_double[i];
            System.out.println(zaokraglenie_do_calkowitych[i]);
            if ((zaokraglenie_do_calkowitych[i]%2==0) && (zaokraglenie_do_calkowitych[i]!=0))
            {
                ilosc_parzystych_niezerowych++;

            }


        }

        int[] parzyste_niezerowe = new int[ilosc_parzystych_niezerowych];
        int counter=-1;

        for (int i=0; i< zaokraglenie_do_calkowitych.length;i++)
        {
            if (((zaokraglenie_do_calkowitych[i]%2)==0) && ((zaokraglenie_do_calkowitych[i])!=0))
            {
                counter++;
               parzyste_niezerowe[counter]=zaokraglenie_do_calkowitych[i];

            }


        }
        System.out.println();
        System.out.println("Parzyste niezerowe:");
        for (int i =0; i<parzyste_niezerowe.length;i++)
        {
            System.out.println(parzyste_niezerowe[i]);

        }

        liczenie = Arrays.stream(parzyste_niezerowe).average();
        double sr2 = liczenie.getAsDouble();
        System.out.println();
        System.out.println("Srednia: " + sr2);






    }





}
