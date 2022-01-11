import java.util.Scanner;

public class ProgModBas_EX4
{
    // 4. (max,min) Fer dues funcions que donats tres nombres ens retornin el màxim i el mínim, respectivament.

    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int [] userNums = new int[3];

        System.out.println("Por favor introduzca el primer numero: ");

        userNums[0]= sc.nextInt();

        System.out.println("Por favor introduzca el segundo numero: ");

        userNums[1]= sc.nextInt();

        System.out.println("Por favor introduzca el tercer numero: ");

        userNums[2]= sc.nextInt();
        System.out.println("" +
                "");
        System.out.println("----------------------------------------");

        System.out.println("" +
                "");

        System.out.println("El numero mayor es: " + getMax(userNums));

        System.out.println("El numero menor es: " + getMin(userNums));

        System.out.println("" +
                "");

        System.out.println("----------------------------------------");
    }

    public static int getMax(int[]userNums)
    {
        int max = userNums[0];

        for (int i = 0; i < 3; i ++)
        {
            if (max < userNums[i])
            {
                max = userNums[i];
            }

        }

        return max;

    }

    public static int getMin(int[]userNums)
    {
        int min = userNums[0] ;
        for (int i = 0; i < 3; i ++)
        {
            if (min > userNums[i])
            {
                min = userNums[i];
            }

        }
        return (min);
    }



}
