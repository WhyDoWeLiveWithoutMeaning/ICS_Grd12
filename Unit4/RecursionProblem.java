package Unit4;

public class RecursionProblem {

    public static void main(String[] args){
        System.out.println(sumDigits(123));
    }

    public static int sumOfRange(int num){
        if(num <= 1)
            return 1;

        return num + sumOfRange(num-1);
    }

    public static int sumDigits(int num){
        if(num < 10) 
            return num;
        return (num%10) + sumDigits(num/10);
    }

    public static int factorial(int num){
        if(num == 1)
            return 1;
        return num * factorial(num-1);
    }

    public static boolean palindrome(String n){
        if(n.length() == 1 || n.length() == 2 && n.charAt(0) == n.charAt(n.length()-1))
            return true;
        if(n.charAt(0) == n.charAt(n.length()-1))
            return palindrome(n.substring(1, n.length()-1));
        return false;
    }

    public static int gcd(int n, int m) {
        if (m > n) {
            return gcd(n, m-n);
        } else if (m < n) {
            return gcd(n, m);
        } else {
            return m;
        }
    }



    
}
