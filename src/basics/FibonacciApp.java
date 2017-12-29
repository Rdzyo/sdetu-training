package basics;


public class FibonacciApp 
{
	public static void main(String[] args)
	{
		
		int[] intArray = new int[] {10,20,30,40,50,60,70,80,90,100};
		System.out.println(minArray(intArray));
		System.out.println(avgArray(intArray));
		System.out.println(maxArray(intArray));
	}
	static void valueN() {
		int sum = 0;
		int n=10;
		for(int i = 1; i <= n;i++)
		{
			sum = sum + i;
			System.out.println(sum);
			
		}
	}
	static int factorial(int n)
	{
		int result;
		if(n==0)
		{
			return 1;
		}
		return result = factorial(n-1) * n;
	}
		

	 
	public static int minArray(int[] intArray) {
	    int min = intArray[0];
	    int i;
	    for (i = 0; i < intArray.length; i++) {
	        if (intArray[i] < min) {
	            min = intArray[i];
	        }
	    }
	    return min;
	}
	 
	public static int avgArray(int[] intArray) {
	    int sum = 0;
	    for (int i = 0; i < intArray.length; i++) {
	        sum = sum + intArray[i];
	    }
	    return sum / intArray.length;
	}
	public static int maxArray(int[] intArray) {
	    int max = intArray[0];
	    int i;
	    for (i = 0; i < intArray.length; i++) {
	        if (intArray[i] > max) {
	            max = intArray[i];
	        }
	    }
	    return max;
	}

}
