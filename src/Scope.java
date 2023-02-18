public class Scope {
    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        String name = "Himanshu";
        {
        //    int a = 79; // already intialized outside the block in the same method
            a = 100; // reasing the origin ref variable to some other value
            System.out.println(a);
            int c = 99;
            name = "Raja";
            System.out.println(name);
            // value initialized in this block, will remain in block
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);


        // scoping in for loops
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            a = 10000;
        }
        System.out.println();

        // now calling the random nums
        random(89);
    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }


}
