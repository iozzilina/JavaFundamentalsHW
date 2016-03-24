import java.util.Scanner;

/**
 * a iozzilina creation
 */


public class p6SumNumbers1N {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int numberN = input.nextInt();
        int sum=0;

        for (int z = numberN;z>=0;z--){
            sum +=z;
        }

        System.out.print(sum);
    }
}
