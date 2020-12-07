import java.util.Random;

public class zad6 {
    public static void main (String [] args)
    {
        int[][] tabNiereg = new int[6][];
        tabNiereg[0] = new int [3];
        tabNiereg[1] = new int [5];
        tabNiereg[2] = new int [2];
        tabNiereg[3] = new int [1];
        tabNiereg[4] = new int [6];
        tabNiereg[5] = new int [2];

        Random losowy = new Random();

        for (int i=0;i< tabNiereg.length;i++)
        {
            for (int j=0;j<tabNiereg[i].length;j++)
            {
                tabNiereg[i][j] = losowy.nextInt(10);
                System.out.print(tabNiereg[i][j] + " ");
            }
            System.out.println();
        }

        int[]tabRegularna=new int[6];
        for (int i=0;i< tabNiereg.length;i++)
        {
            int el_max=0;
            int el_min=11;
            for (int j=0;j<tabNiereg[i].length;j++)
            {

                if (tabNiereg[i][j] >el_max)
                {
                    el_max= tabNiereg[i][j];
                }
                if (tabNiereg[i][j] <el_min)
                {
                    el_min= tabNiereg[i][j];
                }


            }
            if (i%2 == 0) //parzyste
            {
                tabRegularna[i]=el_max;

            }
            else
            {
                tabRegularna[i]=el_min;

            }



        }
        System.out.println();
        //indeksy tablic są od 0, więc pierwszy element jest parzysty
        for (int i=0;i< tabRegularna.length;i++)
        {
            System.out.print(tabRegularna[i] + " ");


        }








    }





}
