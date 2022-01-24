package Unit4;

public class Sorting {
    public static void main(String[] args) {
        
        int[] arr1 = randomArr(10);
        int[] arr2 = randomArr(10);

        System.out.println("Bubble Sort");
        // System.out.println("Before sorting: ");
        // printArr(arr1);
        long startTime = System.currentTimeMillis();
        bubbleSort(arr1);
        long endTime = System.currentTimeMillis();
        // System.out.println("After sorting: "); 
        // printArr(arr1);
        System.out.println("Bubble sort took " + (endTime - startTime) + "ms");

        System.out.println("Bogo Sort");
        // System.out.println("Before sorting: ");
        // printArr(arr1);
        long startTime2 = System.currentTimeMillis();
        bogoSort(arr2);
        long endTime2 = System.currentTimeMillis();
        // System.out.println("After sorting: ");
        // printArr(arr1);
        System.out.println("Bubble sort took " + (endTime2 - startTime2) + "ms");

    }
    public static int[] randomArr(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for (int j = 1; j < arr.length - i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void bogoSort(int[] arr) {
        do{
            for(int i = 0; i < arr.length; i++){
                int r1 = (int) (Math.random() * arr.length);
                int r2 = (int) (Math.random() * arr.length);
                int temp = arr[r1];
                arr[r1] = arr[r2];
                arr[r2] = temp;
            }
        } while(!isSorted(arr));

    }

    public static boolean isSorted(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if (arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
}
