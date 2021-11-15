package Unit1.Task1;

public class Main {
    public static void main(String[] args){
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        for (int i : arr){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
