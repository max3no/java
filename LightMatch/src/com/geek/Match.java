package com.geek;

import java.util.Scanner;
import java.util.Stack;

public class Match {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stringOne = null;
		String stringTwo = null;
		
		stringOne = sc.nextLine();
		stringTwo = sc.nextLine();
		char[] first = stringOne.toLowerCase().toCharArray();
		char[] second = stringTwo.toLowerCase().toCharArray();
		
		int minLength = Math.min(first.length, second.length);
		Stack stackOne = new Stack();
		Stack stackTwo = new Stack();
		for(int i = 0; i<minLength;i++){
			if(first[i] == second[i]){
				stackOne.push(first[i]);
				stackTwo.push(second[i]);
			}
		}
		Integer diff = 0;
		if(first.length < second.length){
			diff = second.length - first.length;
			
		}else
			diff = first.length - second.length;
		
		Integer toBeInsertedInStack = first.length - stackOne.size();
		
		System.out.println(diff + toBeInsertedInStack);
		
		
	}

}
