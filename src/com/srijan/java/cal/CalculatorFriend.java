package com.srijan.java.cal;

import java.util.*;

public class CalculatorFriend  {
	
	public static void main(String[]arg){
		Scanner in=new Scanner(System.in);
		char b;
		do{ 
			System.out.println("PLEASE ENTER 'I'FOR INSTRUCTION");
			System.out.println("PLEASE ENTER 'C'FOR START CALCULATION");
			System.out.println("PLEASE ENTER 'E'TO EXIT");
			
			char s1 =in.nextLine().charAt(0);
			
			switch (s1){
			case'i':
			case'I':
				System.out.println("FIRST ENTER A NUMBER AND PRESS ENTER");
				System.out.println("ENTER THE SIGN BELOW AND PRESS ENTER");
				System.out.println("+ ,- , * ,/ , ^ , rt(FOR SQUARE ROOT),'e' TO EXIT AND PRESS ENTER");
				System.out.println("THEN ENTER THE SECOND NUMBER AND PRESS ENTER");
				System.out.println(" ");
				break;
				
			case'c':
			case'C':
				System.out.println("THE CALCULATOR IS READY");
				double d = in.nextDouble();
				String g = in.next();
				double c = in.nextDouble();
				double a = 0.0;
				
				switch(g){
				case "+":
					a=d + c	;
					break;
				case "-":
					a=d - c	;
					break;
				case "*":
					a=d * c	;
					break;
				case "/":
					a=d / c	;
					break;
				case "^":
					a= Math.pow(d,c)	;
					break;
				case "rt":
				case "Rt":
				case "rT":
				case "RT":
					a=Math.pow(d,1/ c);	
					
					
					break;
				case "e":
				case "E":
					System.out.println("THANKS");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						
					}
					System.exit(0);
					break;
				default:
						System.out.println("Wrong input");
								
				}
				
				System.out.println("the answer is:"+a);
				break;
				
			case 'e':
			case 'E':
				System.out.println("THANKS");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				}
				System.exit(0);
				break;
			default:
				System.out.println("Wrong input");
				
			}
			System.out.println("Would you like to continue or exit? y|n");
			 b = in.next().charAt(0);
			 
		}while(b=='y'||b=='Y');
		System.out.println("THANKS");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}in.close();
		
	}

}