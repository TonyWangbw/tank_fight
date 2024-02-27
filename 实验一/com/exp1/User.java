package com.exp1;
import java.util.Scanner;
public class User{
  public static void main(String args[]){
	int a,b,c,d;
	Scanner reader=new Scanner(System.in);
	 a=reader.nextInt();
	 b=reader.nextInt();
	Vehicle n=new Vehicle(a,b);
	System.out.println(n.speed);
	n.speedUp();
	System.out.println(n.speed);
	n.speedDown();
	System.out.println(n.speed);
}
}
