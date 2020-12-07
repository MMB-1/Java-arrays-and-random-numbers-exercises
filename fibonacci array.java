public class zad3 {

    public static void main (String [] args)
    {
        long[] fibonacci = new long[100];
        fibonacci[0]=1;
        fibonacci[1]=1;

        for (int i=2;i< fibonacci.length;i++)
        {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];


        }

        for (int i=2;i< fibonacci.length;i++)
        {
            System.out.println(i+1 + ". " + fibonacci[i]);


        }




    }

}
