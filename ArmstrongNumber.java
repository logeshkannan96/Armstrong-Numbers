class ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int num = Integer.parseInt(args[0]);		
		int temp = num;
		int count = 0;
		int sum = 0;				

		while(num > 0)	
		{
			num = num / 10;
			count++;	//System.out.println(count);
		} 							
		num = temp;
		while (num > 0)
	 	{
	 		int rem = num % 10;
			int val = 1;
			for(int i = 1; i <= count; i++)
			{	
				val = val * rem;
			}
			num = num / 10;
			sum = sum + val;	//System.out.println(sum);
		}	
		if(temp == sum)
			{
				System.out.println("Armstrong number");
			}

			else
			{
				System.out.println("Not armstrong number");
			} 	
	}	
	
}