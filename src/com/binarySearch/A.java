package com.binarySearch;

import java.util.Scanner;

public class A {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=scan.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++) {
			int num=scan.nextInt();
			array[i]=num;
		}
		int a=0,b=array.length-1,c=0,flag=0,position=0;
		System.out.println("Enter the number to be searched:");
			int key=scan.nextInt();
		while(a<=b & flag==0) {
			c=(a+b)/2;		
			if(key==array[c]) {
				flag=1;
				position=c+1;		
			}
			if(key<array[c]) {
				b=c-1;
			}
			if(key>array[c]) {
				a=c+1;
			}	
		}
		if (flag==1) {
			System.out.println("Number"+key+" found at position:"+position);
		}else {
			System.out.println("Number not found");
		}
		
		
		
		
		
	}

}
