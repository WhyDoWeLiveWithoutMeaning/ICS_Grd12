package Unit3.Array2D;


public class MatrixOperations {

    public static void main(String[] args){

        int arr1[][]  = {
            {3, -5, 7},
            {-8, -9, 10},
            {7, 0, 0},
            {14, -15, -8}
        };

        int arr2[][] = {
            {13, 6, 11},
            {1, 3, -1},
            {0, -3, 12},
            {-8, 2, 1}
        };

        print(arr1);
        System.out.println();
        print(arr2);
        System.out.println();

        int arr3[][] = add(arr1, arr2);

        print(arr3);
        System.out.println();

        scalarMultiply(arr1, 3);

        print(arr1);
        System.out.println();

        print(transpose(arr2));

    }

    // Print array like table to console
    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static int[][] add(int[][] arr1, int[][] arr2){
        if ((arr1[0].length == arr2[0].length) && (arr1.length == arr2.length)){
            int[][] result = new int[arr1.length][arr1[0].length];
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[0].length; j++){
                    result[i][j] = arr1[i][j] + arr2[i][j];
                }
            }
            return result;
        }
        return null;
    }

    public static void scalarMultiply(int[][] arr, int scalar){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = arr[i][j] * scalar;
            }
        }
    }

    public static int[][] transpose(int[][] arr){
        int[][] result = new int[arr[0].length][arr.length];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                result[j][i] = arr[i][j];
            }
        }
        return result;
    }


}
