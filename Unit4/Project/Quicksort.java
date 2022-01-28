package Unit4.Project;

public class Quicksort {

    public static void main(String[] args){
        int[] arr = randomArr(10000000);
        //printArr(arr);
        long start = System.currentTimeMillis();
        quicksort(arr,0,arr.length-1);
        long end = System.currentTimeMillis();
        //printArr(arr);
        System.out.println("Time taken: " + (end-start) + "ms");
    }

    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] randomArr(int size){
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*(size*2));
        }
        return arr;
    }

    ///
    // QUICK SORT
    ///
    

    public static void quicksort(int[] arr, int bottom, int top){
        // If the index of the bottom of the Array is greater than or equal to the index of the top then it is an invalid array because it is empty or already sorted.
        if (bottom < top){
            // Once we parition and put each bigger element to the right of the pivot and the smaller elements to the left
            int pivot = partition(arr, bottom, top);
            // We will repeat the process on the left and right of the pivot
            quicksort(arr, bottom, pivot-1); // Left
            quicksort(arr, pivot+1, top); // Right
        }
    }

    public static int partition(int[] arr, int bottom, int top){
        // Set the pivot to the top of the array.
        int pivot = arr[top];
        // Set the leftbound or where at the end we will put the last index to the bottom of the array.
        int leftBound = bottom-1;

        // As We loop through each element in the array we will check if the element is less than the pivot.
        for(int i = bottom; i < top; i++){  
            // If the element is less than the pivot we will swap it with the element to the left of the pivot.
            // So that we can keep all the bigger elements closer to the pivot and all the smaller elements closer to the bottom of the array.
            if (arr[i] <= pivot){
                leftBound++;

                int temp = arr[i];
                arr[i] = arr[leftBound];
                arr[leftBound] = temp;

            }
        }

        // Once we finish looping through the array we will swap the pivot with the first element that is bigger than the pivot so that the pivot is in the middle of the array.
        leftBound++;

        int temp = arr[top];
        arr[top] = arr[leftBound];
        arr[leftBound] = temp;

        // Then we will return the index of the pivot so that we can sort the left and the right subarrays.
        return leftBound;
    }
}