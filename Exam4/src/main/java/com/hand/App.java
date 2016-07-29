package com.hand;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> list= new ArrayList<Integer>();
    	Map<Integer,String> map = new HashMap<Integer,String>();
    	
    	int a[]= new int [50];

    	
    	int k0=0,k1=0,k2=0,k3=0,k4=0,k5=0,k6=0,k7=0,k8=0,k9=0;
    	String s0="[",s1="[",s2="[",s3="[",s4="[",s5="[",s6="[",s7="[",s8="[",s9="[";
    	
    	int a0[]= new int [50];
    	int a1[]= new int [50];
    	int a2[]= new int [50];
    	int a3[]= new int [50];
    	int a4[]= new int [50];
    	int a5[]= new int [50];
    	int a6[]= new int [50];
    	int a7[]= new int [50];
    	int a8[]= new int [50];
    	int a9[]= new int [50];
    	
    	for (int i = 0; i < a.length; i++) {
			a[i]=(int)(Math.random()*100);
			list.add(a[i]);
			switch((int)(a[i]/10)){
			case 0:

				a0[k0++]=a[i];
				s0=s0+a[i]+",";
				break;
			case 1:

				a1[k1++]=a[i];
				s1=s1+a[i]+",";
				break;
			case 2:
				
				a2[k2++]=a[i];
				s2=s2+a[i]+",";
				break;
			case 3:
			
				a3[k3++]=a[i];
				s3=s3+a[i]+",";
				break;
			case 4:
			
				a4[k4++]=a[i];
				s4=s4+a[i]+",";
				break;
			case 5:
		
				a5[k5++]=a[i];
				s5=s5+a[i]+",";
				break;
			case 6:
				
				a6[k6++]=a[i];
				s6=s6+a[i]+",";
				break;
			case 7:
			
				a7[k7++]=a[i];
				s7=s7+a[i]+",";
				break;
			case 8:
				
				a8[k8++]=a[i];
				s8=s8+a[i]+",";
				break;
			case 9:
				
				a9[k9++]=a[i];
				s9=s9+a[i]+",";
				break;
			}
		}
    	s0=s0.substring(0, s0.length()-1)+"]";
    	map.put(0, s0);
    	
    	s1=s1.substring(0, s1.length()-1)+"]";
    	map.put(1, s1);
    	
    	s2=s2.substring(0, s2.length()-1)+"]";
    	map.put(2, s2);
    	
    	s3=s3.substring(0, s3.length()-1)+"]";
    	map.put(3, s3);
    	
    	s4=s4.substring(0, s4.length()-1)+"]";
    	map.put(4, s4);
    	
    	s5=s5.substring(0, s5.length()-1)+"]";
    	map.put(5, s5);
    	
    	s6=s6.substring(0, s6.length()-1)+"]";
    	map.put(6, s6);
    	
    	s7=s7.substring(0, s7.length()-1)+"]";
    	map.put(7, s7);
    	
    	s8=s8.substring(0, s8.length()-1)+"]";
    	map.put(8, s8);
    	
    	s9=s9.substring(0, s9.length()-1)+"]";
    	map.put(9, s9);
    	

		
    	System.out.print("随机生成50个小于100的数，分别为: ");
    	for (int i = 0; i < a.length; i++) {
    		if(i<a.length-1)
    		System.out.print(a[i]+",");
    		if(i==a.length-1)
        		System.out.print(a[i]);
		}
    	System.out.println();
    	System.out.print("Map中的数据为： ");
    	System.out.print("{ 0 => "+s0+", ");
    	System.out.print("1 => "+s1+", ");
    	System.out.print("2 => "+s2+", ");
    	System.out.print("3 => "+s3+", ");
    	System.out.print("4 => "+s4+", ");
    	System.out.print("5 => "+s5+", ");
    	System.out.print("6 => "+s6+", ");
    	System.out.print("7 => "+s7+", ");
    	System.out.print("8 => "+s8+", ");
    	System.out.print("9 => "+s9+"}");

    	Arrays.sort(a);

    	 k0=0;k1=0;k2=0;k3=0;k4=0;k5=0;k6=0;k7=0;k8=0;k9=0;
    	 s0="[";s1="[";s2="[";s3="[";s4="[";s5="[";s6="[";s7="[";s8="[";s9="[";
    	for (int i = 0; i < a.length; i++) {
			
		
			switch((int)(a[i]/10)){
			case 0:

				a0[k0++]=a[i];
				s0=s0+a[i]+",";
				break;
			case 1:

				a1[k1++]=a[i];
				s1=s1+a[i]+",";
				break;
			case 2:
				
				a2[k2++]=a[i];
				s2=s2+a[i]+",";
				break;
			case 3:
			
				a3[k3++]=a[i];
				s3=s3+a[i]+",";
				break;
			case 4:
			
				a4[k4++]=a[i];
				s4=s4+a[i]+",";
				break;
			case 5:
		
				a5[k5++]=a[i];
				s5=s5+a[i]+",";
				break;
			case 6:
				
				a6[k6++]=a[i];
				s6=s6+a[i]+",";
				break;
			case 7:
			
				a7[k7++]=a[i];
				s7=s7+a[i]+",";
				break;
			case 8:
				
				a8[k8++]=a[i];
				s8=s8+a[i]+",";
				break;
			case 9:
				
				a9[k9++]=a[i];
				s9=s9+a[i]+",";
				break;
			}
		}
    	s0=s0.substring(0, s0.length()-1)+"]";
    	map.put(0, s0);
    	
    	s1=s1.substring(0, s1.length()-1)+"]";
    	map.put(1, s1);
    	
    	s2=s2.substring(0, s2.length()-1)+"]";
    	map.put(2, s2);
    	
    	s3=s3.substring(0, s3.length()-1)+"]";
    	map.put(3, s3);
    	
    	s4=s4.substring(0, s4.length()-1)+"]";
    	map.put(4, s4);
    	
    	s5=s5.substring(0, s5.length()-1)+"]";
    	map.put(5, s5);
    	
    	s6=s6.substring(0, s6.length()-1)+"]";
    	map.put(6, s6);
    	
    	s7=s7.substring(0, s7.length()-1)+"]";
    	map.put(7, s7);
    	
    	s8=s8.substring(0, s8.length()-1)+"]";
    	map.put(8, s8);
    	
    	s9=s9.substring(0, s9.length()-1)+"]";
    	map.put(9, s9);
    	

		
    	System.out.print("随机生成50个小于100的数，分别为: ");
    	for (int i = 0; i < a.length; i++) {
    		if(i<a.length-1)
    		System.out.print(a[i]+",");
    		if(i==a.length-1)
        		System.out.print(a[i]);
		}
    	System.out.println();
    	System.out.print("排序后Map中的数据为： ");
    	System.out.print("{ 0 => "+s0+", ");
    	System.out.print("1 => "+s1+", ");
    	System.out.print("2 => "+s2+", ");
    	System.out.print("3 => "+s3+", ");
    	System.out.print("4 => "+s4+", ");
    	System.out.print("5 => "+s5+", ");
    	System.out.print("6 => "+s6+", ");
    	System.out.print("7 => "+s7+", ");
    	System.out.print("8 => "+s8+", ");
    	System.out.print("9 => "+s9+"}");
    	
    	
    	
    }
    
    

      
    
}
