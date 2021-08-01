public class Main
{
	public static void main(String[] args) 
	{
	
	//----------------------------------------------------------------------------
    //ARRAYS 
        
    int[] values = new int[3];
    System.out.println(values[0]);
        
    values[0] = 10;
    values[1] = 20;
    values[2] = 30;
        
    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);
        
    for(int z = 0; z < values.length; z++)
    {
        System.out.println(values[z]);
    }
        
    int[] numbers = {5, 6, 7, 8};
        
    for(int h = 0; h < numbers.length; h++)
    {
        System.out.println(numbers[h]);
    }
		
	
	//----------------------------------------------------------------------------
    //ARRAYS OF STRINGS 
    
    String[] words = new String[3];
    
    words[0] = "hello";
    words[1] = "to";
    words[2] = "you";
    
    System.out.println(words[2]);
    
    String[] fruits = {"apple", "banana", "pear", "kiwi"};
    
    for(String fruit: fruits)
    {
        System.out.println(fruit);    
    }
		
	String textNull = null;
	System.out.println(textNull);
		
	String[] textsAreSetToNullByDefault = new String[3];
	
	for(int counter = 0; counter < textsAreSetToNullByDefault.length; counter++)
	{
	    System.out.println(textsAreSetToNullByDefault[counter]);
	}
		
		
	//----------------------------------------------------------------------------
    //MULTI DIMENSIONAL ARRAYS
    
    int[] values = {1, 4, 2345};
    
    System.out.println(values[2]);
    
    int[][] grid = {
        {1, 4, 2345},
        {2, 9},
        {65, 56, 3543, 2346}
    };
		
	System.out.println(grid[2][3]);
		
	
	String[][] textGrid = new String[2][3];
	
	textGrid[0][1] = "hello there";
	textGrid[0][2] = "my guyyy";
	
	System.out.println(textGrid[0][2]);
	
	
	for(int row = 0; row < grid.length; row++)
	{
	    for(int column = 0; column < grid[row].length; column++)
	    {
	        System.out.printf(grid[row][column] + "\t");
	    }
	    System.out.println();
	}
		
		
		
		
		
	}
	

}
