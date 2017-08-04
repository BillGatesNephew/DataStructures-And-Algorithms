
public class BrutePrimalityTest {
	
	/* Brute Force Algorithm for Testing Primes */
	
	public boolean testPrime(int val)
	{
		if(val < 2) return false; 
		
		int s = (int) Math.floor(Math.sqrt(val)); 
		
		for(int i = 2; i <= s; i++)
		{
			if((val % i) == 0) return false; 
		}
		
		return true; 
	}
	
	public static void main(String[] args)
	{
		BrutePrimalityTest obj = new BrutePrimalityTest();
		System.out.println(obj.testPrime(32));
	}
	
}
