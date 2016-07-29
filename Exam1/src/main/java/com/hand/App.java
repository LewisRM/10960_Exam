package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	printP(101,200);
    }
    
    public static void printP(int m,int n){
    	int a[] = new int[n-m];
    	int temp=0;
    	int j=0;
    	for (int i = m; i <= n; i++) {
    		j=0;
			for (j = 2; j < i/2; j++) {
				 if(i%j==0) break;
			}
			if(j==i/2) {
				a[temp]=i;
				temp++;
			}
		}
    	System.out.print("一共有"+temp+"个素数，分别是：");
    	for (int i = 0; i <= temp; i++) {
    		if(i<(temp-1))
			System.out.print(a[i]+",");
    		if(i==(temp-1))
    	    System.out.print(a[i]);	
		}
    	
    }
}
