package Unit4;

import java.util.ArrayList;

/* Scroll to the bottom of this program to find the linearSearch and
 * binarySearch methods.  Write your own implementation of those seach
 * methods.  Make them as efficient as possible.  The methods should
 * return the location (index) of the value if it exists in the array, 
 * or -1 of the value does not exist in the array.
 */

import java.util.Arrays;

public class Searching
{
	public static void main(String[] args)
	{
		long startTime = 0;
		double time = 0;
		
		
		//create an array of ints
		int[] values = new int[2000000000];
		
		//fill array with random values in 0-9999999 range
		for(int i = 0; i < values.length; i++)
		{
			values[i] = (int)(Math.random() * 10000000);
		}
		
		//choose 100 random values to search for and print search results
		//Linear Search of unsorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(linearSearch(values,rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nLinear Search completed in " + time + "seconds\n\n");
		
		//sort the array
		Arrays.sort(values);
		
		//choose 100 random values to search for and print search results
		//Linear Search of sorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(linearSearch(values,rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nLinear Search completed in " + time + "seconds\n\n");
		
		//choose 100 random values to search for and print search results
		//Binary Search of sorted array
		startTime = System.currentTimeMillis();
		for(int i = 0; i < 100; i++)
		{
			int rand = (int)(Math.random() * 10000000);
			System.out.print(binarySearch(values,rand) + ",");
		}
		time = (System.currentTimeMillis() - startTime) / 1000.0;
		System.out.println("\nBinary Search completed in " + time + "seconds\n\n");
		
	}
	
	
	public static int linearSearch(int[] array, int val)
	{
		for(int i = 0; i < array.length; i++){
			if (array[i] == val)
				return array[i];
		}
		return -1;
	}
	
	public static int binarySearch(int[] array, int val)
	{

		int bottom = 0;
		int top = array.length - 1;
		int answer = -1;
		while(top > bottom){
			int middlePoint = bottom + (top - bottom) / 2;
			if(array[middlePoint] == val){
				answer = array[middlePoint];
				break;
			}
			if (array[middlePoint] > val)
				top = middlePoint-1;
			else
				bottom = middlePoint+1;
		}
		return answer;
	}

	public static int monkeySearch(int[] array, int val){
		int n = 0;
		while (array[n] != val){
			n = (int)(Math.random() * array.length);
		}
		return array[n];
	}
}