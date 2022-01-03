package Unit3.Array2D;

public class Array2D
{
	public static void main(String[] args)
	{
		int[][] a1 = new int[4][3];
		
		a1[2][1] = 4;
		
		int[][] a2 = {{0,1,2}, {4,5,6}, {7,8,9}};
		
		print(a1);
		
		for(int row = 0; row < a1.length; row++)
		{
			for(int col = 0; col < a1[row].length; col++)
			{
				a1[row][col] = (int)(Math.random() * 100);
			}
		}
		
		
		System.out.println();
		print(a1);
		
		
	}
	
	public static void print(int[][] array)
	{
		for(int row = 0; row < array.length; row++)
		{
			for(int col = 0; col < array[row].length; col++)
			{
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}
	}
	
	//public static int[][] add(int[][] a1, int[][] a2)
	
	
	
	
	
	
	
	
	
}
