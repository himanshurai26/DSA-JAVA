import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String naam = sc.next();

        String result = myGreet(naam);
        System.out.println(result);

        System.out.println(greet());

    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "How Are you";
        return  greeting;
    }

}
