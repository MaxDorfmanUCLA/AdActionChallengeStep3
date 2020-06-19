package mavenPackage;

public final class App {
    static int[] outputRange(int min, int max) {
        // initialize counts of integers and keywords: fizz, buzz, fizzbuzz
        int f = 0;
        int b = 0;
        int fb = 0;
        int in = 0;
        int l = 0;
        
        for (int i = min; i <= max; i++){
            String a = Integer.toString(i);
            if(a.indexOf("3") >= 0){
                System.out.print("lucky");
                l++;
            }
            else if (i % 15 == 0){
                System.out.print("fizzbuzz");
                fb++;
            }
            else if (i % 5 == 0){
                System.out.print("buzz");
                b++; //increment count of keyword buzz
            }
            else if (i % 3 == 0){
                System.out.print("fizz");
                f++; //increment count of keyword fizz
            }
            else{
                System.out.print(i);
                in++; //increment count of integer output
            }
            System.out.print(" ");
        }
        System.out.print("fizz: ");
        System.out.print(f);
        System.out.println();
        System.out.print("buzz: ");
        System.out.print(b);
        System.out.println();
        System.out.print("fizzbuzz: ");
        System.out.print(fb);
        System.out.println();
        System.out.print("lucky: ");
        System.out.print(l);
        System.out.println();
        System.out.print("integer: ");
        System.out.print(in);
        System.out.println();

        int res[] = {f,b,fb,l,in}; // array of keyword counts *for unit testing*
        return res;
    }
}
