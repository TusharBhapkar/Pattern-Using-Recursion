package examMains;

public class QuestionFour {
	public static void main(String[] args) 
	{
		

		printMe(1,1);
		
		
	}

	private static void printMe(int i, int count) 
	{
		 if (i>count) 
		 {
			 System.out.println();
			 if(count<5)
			 printMe(1, count+1);
		} else 
		{
			System.out.print(i+" ");
			printMe(i+1, count);
		}
		
	}
}
