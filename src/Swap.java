public class Swap {
    public static void main(String[] args) {
           int a = 10;
           int b = 23;

        //   int temp = a;
        //  a = b;
        //    b = temp;
        //   System.out.println(a);
        //   System.out.println(b);

        swap(a,b);

        String name = "Himanshu Kumar Rai";
        changeName(name);
        System.out.println(name);

    }

        static void swap(int num1, int num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
            System.out.println(num1 + " " + num2);
        }

        static void changeName(String naam){
        naam = "Himanshu Kumar";
            System.out.println("Your name is + " + naam);
        }



}
