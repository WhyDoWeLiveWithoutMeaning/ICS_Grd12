package Unit4;

public class Recursion {

    public static void main(String[] args){

    }

    public static int sumOfRange2(int num){
        int total = 0;
        for(int i = 1; i <= num; i++){
            total += i;
        }
        return total;
    }

    public static int sumOfRange(int num){
        if(num == 1){
            return 1;
        }
        return num + sumOfRange(num-1);
    }

    public static int pow(int base, int pow){
        if (pow == 0){
            return 1;
        }
        return base * pow(base, pow-1);
    }
}
