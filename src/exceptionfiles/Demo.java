package exceptionfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts");
		doMath(12,0);
		System.out.println("Program continous");
	}
	
	public static void doMath(int a, int b)
	{
		answer(a,b);
		
	}
	public static double answer(int x, int y) {
		//Catch error here
		return x/y;
	}

}
