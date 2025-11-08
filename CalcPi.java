// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int N = Integer.parseInt(args[0]);
		double sum = 1.0;
		double div = 3.0;
		int count = 1;
		boolean sign = true;
		System.out.println("pi according to Java: " + Math.PI);
		while (count < N)
		{
			if(sign)
				sum = sum - (((double)1.0)/div);
			else
				sum = sum + (((double)1.0)/div);
			div = div +2;
			sign = !sign;
			count ++;
		}
		System.out.println("pi, approximated: " + sum*4);
	}
}