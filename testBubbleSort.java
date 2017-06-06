package algo;

public class testBubbleSort 
{
	public static void main(String[] args) 
	{
		sortNumbers();
		sortStrings();
	}
	
	public static void sortNumbers()
	{
		Integer[] anArray = { 15, 8, 10, 2, 5, 56, 
				80, 93, 1, 45};
		System.out.println("Bubble sort: O(n^2)");
		System.out.println("Test for BUBLE SORT with Integer Array");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
		System.out.println();
		bubleSort.bubleSort(anArray, anArray.length);
		System.out.println("\nPrinting sorted array...");

		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
	}
	
	public static void sortStrings()
	{
		String[] anArray = 
			{ "word", "test", "bubble", "sort", 
			  "array", "string", "structure", "git",
			  "bit", "do", "left","zoo","alabama", "fargo",
			  "moon"};
		System.out.println("Bubble sort: O(n^2)");
		System.out.println("Test for BUBLE SORT with string array");
		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
		System.out.println();
		bubleSort.bubleSort(anArray, anArray.length);
		System.out.println("\n\nPrinting sorted array...");

		for (int i = 0; i < anArray.length; i++)
		{
			System.out.print(anArray[i] + " ");
		}
	}
}
