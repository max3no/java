import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int i = 0 ; i < n ; i++)
    	{
    		
    	    for(int j = 0;j<(n-i-1)*2;j++)
    	    {
    	    	
    	    	System.out.print(" ");
    	    	
    	    	    	    	
    	    }
    	    for(int k = 0;k<=i;k++)
    	    {
    	    	if(k == i)
    	    	System.out.print(k+1);
    	    	else
    	    		System.out.print((k+1)+" ");
    	    }
    	    System.out.println();
    	    
    	}
		
	}

}


