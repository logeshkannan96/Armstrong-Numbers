class ArmstrongNumbers
{
	public static void main(String[] args) 
	{
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		//int count = 0;
		//int arms = 0;
		//int temp = num;
		//int tnum = num;

		for(int num = start; num <= end; num++)
		{   
			int temp = num; 
			int tnum = num;
			int count = 0;
			int pownum = num; 
			int arms = 0;
		
			while(tnum > 0)							//calculate no of digs
			{
				int dig = tnum % 10;
				count++;
				tnum = tnum / 10;
			}										//System.out.println(count);
			
			while(pownum > 0)						//powering each digit with number of digits and adding them
			{
				int pow = 1;
				int dig = pownum % 10;				//System.out.println(dig);
				for(int i = 1; i <= count; i++)
				{
					pow = pow * dig;	
				}
				pownum = pownum / 10;				//System.out.println(pow);
				arms = pow + arms;					//System.out.println(arms);
			}										//System.out.println(arms);
			
			if(arms == temp)
			{
				System.out.println(arms);
			} 
		} 
	}
}