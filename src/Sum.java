import java.util.Scanner;

public class Sum {

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the number = " + sum);
    }

    public static void main(String[] args) {
        int ans = sum3(67,75);
        System.out.println(ans);
        int ans1 = sum2();
        System.out.println(ans1);
         sum();
    }
}
