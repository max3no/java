import java.util.Scanner;

/**
 * @author Vaibhav.Singh
 * Minimum steps to reach 1
 * given a positive integer
 * we can do following on it:-
 *  - subtract 1 from it
 *  -if divisible by 2 divide it
 *  -if divisible by 3 divide it
 * reach 1 in minimum steps
 */
public class Steps {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int memo [] = new int[n+1];
		for(int i = 0; i<=n;i++){
			memo[i] = -1;
		}
		
//		int ans = getMinStepsUsingMemoization(n, memo);
		int ans = getMinStepsUsingDP(n);
		System.out.println(ans);
		sc.close();
		
	}
	
	static int getMinStepsUsingMemoization(int n,int[] memo){
		 if(n == 1)
			 return 0;
		 
		 if(memo[n] != -1)
			 return memo[n];
		 
		 int r = 1 + getMinStepsUsingMemoization(n-1, memo);
		 
		 if( n % 2 == 0){
			 r = Math.min(r, 1 + getMinStepsUsingMemoization(n/2, memo));
		 }
		 if( n % 3 == 0){
			 r = Math.min(r, 1 + getMinStepsUsingMemoization(n/3, memo));
		 }
		
		 memo[n] = r;
		
		return r;

	}
	
	static int getMinStepsUsingDP(int n){
		
		int res[] = new int[n+1];
		res[1] = 0;
		
		for(int i = 2 ; i <= n ; i++){
			res[i] = 1 + res[i-1];
			if(i % 2 == 0){
				res[i] = Math.min(res[i], 1 + res[i/2]);
			}
			if(i % 3 == 0){
				res[i] = Math.min(res[i], 1 + res[i/3]);
			}
			
		}
		
		return res[n];
	}

}
