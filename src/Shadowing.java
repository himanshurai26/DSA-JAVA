public class Shadowing {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x; // the clss variable at line 2 is shadowed by this
      //  System.out.println(x); // scope will begin when value is initialized
        x = 65;
        System.out.println(x);  //65
        fun();
    }

    static void fun(){
        System.out.println(x);
    }

}
