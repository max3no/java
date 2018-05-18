package com.geek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateCode {

	public Boolean isSafeMove(Integer i,Integer j,List<Integer> obstacle,Integer size,Integer crown){
		
		if(obstacle.contains((i*size) + j))
			return false;
		return true;
	}
	
	public Integer GameofThrones(Integer i,Integer j,List<Integer> obstacles,Integer crown,char[][] maze,Integer size,Integer result){
		if(i == 0 || j == 0){
			return 0;
		}
		if(isSafeMove(i-1,j,obstacles,size,crown)){
			result++;
			return GameofThrones((i-1),j,obstacles,crown,maze,size,result)+result;
		}
		if(isSafeMove(i,j-1,obstacles,size,crown)){
			result++;
			return GameofThrones((i),(j-1),obstacles,crown,maze,size,result)+result;
		}
		if(isSafeMove(i-1,j-1,obstacles,size,crown)){
			result++;
			return GameofThrones((i-1),(j-1),obstacles,crown,maze,size,result)+result;
		}
		return 0;
	}
	//square matrix
	public static void main(String[] args) {
		CandidateCode code = new CandidateCode();
		Scanner sc = new Scanner(System.in);
		Integer size = sc.nextInt();
		char[][] maze = new char[size][size];
		String[][] mat = new String[size][1];
		List<Integer> obstacles = new ArrayList<>();
		Integer crown = null;
		Integer x = null;
		Integer y = null;
		for(int vertical = 0 ; vertical<size;vertical++){
			
			mat[vertical][0] = sc.next();
			for(int horizontal = 0;horizontal<size;horizontal++){
				maze[vertical][horizontal] = mat[vertical][0].toLowerCase().charAt(horizontal);
				if(mat[vertical][0].toLowerCase().charAt(horizontal) == 'o'){
					obstacles.add((((vertical)*size)+(horizontal+1)) -1);
					continue;
				}
				if(mat[vertical][0].toLowerCase().charAt(horizontal) == 'c'){
					crown = (((vertical)*size)+(horizontal+1) -1 );
					x = vertical;
					y = horizontal;
				}
			}
		}
		Integer result = 0;
		result = code.GameofThrones(x,y,obstacles,crown,maze,size,result);
		
		
		//for printing input
		{
			for(int i = 0;i<size;i++){
				for(int j =0;j<size;j++){
					System.out.print(maze[i][j]);
				}
				System.out.println();
			}
			
		}
		
		System.out.println("obstacles "+obstacles);
		System.out.println("crown " +crown);
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("result "+(result));
		sc.close();
		
	}
}
