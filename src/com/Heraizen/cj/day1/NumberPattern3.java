package com.Heraizen.cj.day1;

public class NumberPattern3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for (int j=1;j<i+1;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}