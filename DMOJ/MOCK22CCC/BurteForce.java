package DMOJ.MOCK22CCC;

public class BurteForce {
    public static void main(String[] args){

        for(int i = 0; i<100; i++){
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            int c = (int)(Math.random()*10);
            System.out.print(a + " " + b + " " + c + " ");

            boolean passed = false;

            if ((a+b+c)%2 == 0 && a >= c){
                int p = test2(a, b, c);
                if (p == 0){
                    passed = true;
                }
            }
            
            if (passed){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // Step 1:
    public static int test1(int m, int n, int o){
        int a = m, b = n, c = o;
        while(a > 0 && c > 0){
            a--;
            c--;
        }
        a %= 2;
        b %= 2;
        return a+b+c;
    }

    public static int test2(int a, int b, int c){
        if(a >= c && b > 0){
            a--;
            b = 0;
            c--;
        }
        while(a>0 && c > 0){
            a--;
            c--;
        }
        a %= 2;
        return a+b+c;
    }
}
