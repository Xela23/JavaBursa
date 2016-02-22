package com.itbursa.kovalenko.task2;

import java.util.Arrays;

public class Vector {
	
	int[] a; 
	
	public Vector(){
		this.a = new int[0];
	}
	
	public void clear(){
		for (int i = 0; i<a.length; i++){
			a[i] = 0;
		}
	}
	
	public void search (int b){
	for (int i = 0; i<a.length; i++){
		if (i==b){
			System.out.println(a[i]);
		}
		else if(b>a.length  || b<0){
			System.out.println("Такого элемента в массиве нет");
			break;
			}
		}	
	}
	public void add(int n){
		int length = a.length;
		a = Arrays.copyOf(a, length+1);
		a[length]=n;
	}
	
	public void delete(int n){
		for (int i = 0; i<a.length; i++){
			if (i==n){
				a[i] = 0;
				System.out.println(Arrays.toString(a));
				}
				else if(n>a.length || n<0){
				System.out.println("Такого элемента в массиве нет");
				break;
				}
				//System.out.println(a[i]);
			}
		}

	public void print(){
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args){
		Vector x = new Vector();
		x.a = new int[]{1,2,6,6,3};
		x.search(1);
		x.print();
		x.clear();	
		x.print();
		x.a = new int[]{1,2,6,6,3};
		x.add(6);
		x.print();
		x.delete(4);
	}
}	

