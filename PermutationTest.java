
public class PermutationTest {
	
	public final static int BLANK = 0; // To see exactly where the Array Value is meant
	
	public static boolean isPermutation(int [] array){
		
		int[] check = new int [arLength + 1]; 
		int i = -1;
		
		

/* Check is use to control if a number is used twice in an array. */
/* Is a number i used check[i] is changed to zero. 				  */
		
		
		for (int k = 0; k <= array.length ;k++)
				{
				check[k] = 1;
				
				}
		
		while( i < array.length - 1  )
			{	
			i++;
			if (check[array[i]] == 0)	// Number has been used twice => false
						return false;
					
			if (check[array[i]] == 1 && array[i] != BLANK)
						check[array[i]] = 0;
			}
		return true;
	}
}
	
		//Try it out
	
	/*public static void main( String[] args){
		int[] TestArray = new int [4];
		
		TestArray[0] = 4;
		TestArray[1] = 1;
		TestArray[2] = 2;
		TestArray[3] = 3;
		
		System.out.printf("%b", isPermutation(TestArray, 4));
	}
	
}	
*/