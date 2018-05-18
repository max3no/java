import java.util.ArrayList;
import java.util.Scanner;

public class ArrayError {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> array  =  new ArrayList<>();
		int j = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Integer start = 0;
		Integer lastPos = 0;
		ArrayList<String> ab = new ArrayList<>();
		ab.add("testValue");
		ab.add("anothertestvalue");
		while(j<10){
			System.out.println("Enter position");
			Integer i = sc.nextInt();
			if(i >= lastPos){
				start = lastPos;
				lastPos = i;
				array = fillWithNull(start,lastPos,array);
				array.set(i-1, ab);
			}
			else{
				array.set(i-1, ab);
			}
			
			
			for(ArrayList<String> a:array){
				System.out.println(a);
			}
			System.out.println("--------------------------");
			j++;
		}
	}
	public static ArrayList<ArrayList<String>> fillWithNull(Integer start,Integer lastPos,ArrayList<ArrayList<String>> array){
		for(int i = start;i<lastPos;i++){
			array.add(null);
		}
		return array;
	}
}
