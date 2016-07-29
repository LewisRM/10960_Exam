package com.hand;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner= new Scanner(System.in);
        System.out.print("请输入日期:");
        String date= scanner.next();
        
        int year=Integer.parseInt(date.substring(0,4));
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));
        
        int sum=day;
        
        switch(month){
         case 1:
        	 sum+=0;
        	 break;
         case 2:
        	 sum=sum+31;
        	 break;
         case 3:
        	 sum=sum+31+28;
        	 break;
         case 4:
        	 sum=sum+31+28+31;
        	 break;
         case 5:
        	 sum=sum+31+28+31+30;
        	 break;
         case 6:
        	 sum=sum+31+28+31+30+31;
        	 break;
         case 7:
        	 sum=sum+31+28+31+30+31+30;
        	 break;
         case 8:
        	 sum=sum+31+28+31+30+31+30+31;
        	 break;
         case 9:
        	 sum=sum+31+28+31+30+31+30+31+31;
        	 break;
         case 10:
        	 sum=sum+31+28+31+30+31+30+31+31+30;
        	 break;
         case 11:
        	 sum=sum+31+28+31+30+31+30+31+31+30+31;
        	 break;
         case 12:
        	 sum=sum+31+28+31+30+31+30+31+31+30+31+30;
        	 break;
        }
        
        if((year%400==0) || (year%4==0 && year%100 !=0)){
        	if(month>2)
        		sum++;
        }
        
        
        System.out.println("你输入的日期为当年的第" +sum+ "天");

    }
}
