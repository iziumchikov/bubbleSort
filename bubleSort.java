package algo;

public class bubleSort 
{
	public static <T extends Comparable<? super T>>
				void bubleSort(T[] array, int n) 
	{
		boolean sorted = false;
		int step = 0;
		
		for(int pass = 1;(pass < n) && !sorted; ++pass)
		{
			sorted = true;
			for (int i = 0; i < n - pass; ++i) 
			{
				step += 1;
				System.out.println("\nAfter " + (i + 1) + "st pass: " +
									"(Total steps: "+ step + ")");
				for(int k = 0;k < n; k++) 
				{
					System.out.print(" "+array[k]);
				}
				
				int nextIndex = i + 1;
				if(array[i].compareTo(array[nextIndex]) > 0) 
				{
					T temp = array[i];
					array[i] = array[nextIndex];
					array[nextIndex] = temp;
					sorted = false;
				}
			}
		}
	}

}
