package com.hand;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("请输入工资:");
        double salary= scanner.nextDouble();
        double count=salary-3500;
        if(count<=0)count=0;
        if(count>0 && count<=1500){
        	count=count*0.03;
        }else if(count<=4500){
        	count=count*0.1;
        }else if(count<=9000){
        	count=count*0.2;
        }else if(count<=35000){
        	count=count*0.25;
        }else if(count<=55000){
        	count=count*0.3;
        }else if(count<=80000){
        	count=count*0.35;
        }else if(count>80000){
        	count=count*0.45;
        }
        
        System.out.println("所需要缴纳的税费为:"+count);
        
    }
}
