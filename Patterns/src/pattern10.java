import java.util.Scanner;

/*
 * 
 * 
 
            * 
         * * * 
      * * * * * 
   * * * * * * * 
* * * * * * * * * 
* 
 */


public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			for(int i = 1;i<=n;i++)
			{
				for(int j = n ; j>i;j--)
				{
					System.out.print("  ");
				}
				for(int k = 0 ; k<i ; k++)
				{
					if(i == 1)
						System.out.print("*");
					else
					System.out.print("* ");
				}
				for(int l = 0;l<i;l++)
				{
					if(l != (i-1))
					{
						if(l == (i-2))
						System.out.print("*");
						else
							System.out.print("* ");
					}
					
				}
				System.out.println();
			}

	}

}
