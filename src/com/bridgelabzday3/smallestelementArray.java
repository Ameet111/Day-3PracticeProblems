package com.bridgelabzday3;

public class smallestelementArray {
	
	 public static void main(String[] args) {  
		  
	        //Initialize array  
	        int [] arr = new int [] {75, 11, 5, 48, 60};  
	        //Initialize min with first element of array.  
	        int min = arr[0];  
	        //Loop through the array  
	        for (int i = 0; i < arr.length; i++) {  
	            //Compare elements of array with min  
	           if(arr[i] <min)  
	               min = arr[i];  
	        }  
	        System.out.println("Smallest element present in given array: " + min);  
	    }  

}
