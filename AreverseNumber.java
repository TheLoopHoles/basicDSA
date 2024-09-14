import java.util.Scanner;

/**
 * AreverseNumber
 */
public class AreverseNumber {

    static int reverseNumber(int number){
        int reversedNumber = 0;

        while(number>0){
            int lastdigit = number%10;
            reversedNumber = ( reversedNumber * 10 ) + lastdigit ;
            number = number/10;
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter integer number to reverse: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("The reverse of "+num+" is "+reverseNumber(num));

    }
}