package NewPattern;

public class pat1 
{
	public static void main(String args[])
	{
	int no=1;
	char ch='a';
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=6;j++)
		{
			if(j<=i)
			{
				if(i==1||i==3||i==6)
				{
					System.out.print(no);
				}
				else
				{
					System.out.print(ch);
					ch++;
				}
			}
			else
			{
				System.out.print("");
			}
		}
		System.out.println();
	}
}
}
