
public class Generateprimenumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int i = 0;
		int num = 0;
		
		String primenumbers = "";
		
		for (i = 1; i <=100; i++)
		{
			//setting counter to zero
			int counter = 0;
			for(num = i; num>=1; num--)
			{
				//using mod function
			if(i%num==0)
			{
				counter = counter +1;
			}
	}
	if(counter==2)
	{
		primenumbers = primenumbers + i + " ";
	}
		}
//print prime numbers
		System.out.println("Prime numbers from 1 to 100:");
		System.out.println(primenumbers);
		

	}
}

