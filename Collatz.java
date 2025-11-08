// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		String mode = args [1];
	    int seed = Integer.parseInt(args[0]);
		int sum = 0;
		int count = 1;
		boolean tick = true;
		if (mode.equals("concise") || mode.equals("c"))
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		else
		{
			for (int i = 1; i <= seed; i++)
			{
				sum = i;
				System.out.print(i);
				while ((sum != 1) || (tick == true))
				{
					tick = false;
					System.out.print(", ");
					if(sum%2 == 0)
					sum = sum / 2;
					else
					sum = (sum*3) + 1;
					System.out.print(sum);
					count ++;
				}
				System.out.println(" (" + count + ")");
				count = 1;
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
	}
}
