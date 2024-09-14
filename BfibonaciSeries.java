import java.util.Scanner;

public class BfibonaciSeries {

    static void FibonacciSeries(int numberTerms){
        int value1 = 0, value2 = 1;
        while(numberTerms>0){
            System.out.println(value1);
            int temp = value1;
            value1 = value2;
            value2 = temp+value1;
            numberTerms--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms of FibonacciSeries: ");
        int terms = sc.nextInt();
        sc.close();

        System.out.println("Following are the "+terms+" terms of the series:");
        FibonacciSeries(terms);
    }
}
