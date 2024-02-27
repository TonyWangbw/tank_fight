package com.exp1;
public class Vehicle{
	int speed;
	int power;
	Vehicle(int a,int b){
	speed=a;
	power=b;
}
	void speedUp(){
	speed+=20;
	}
	void speedDown(){
	speed-=10;
	}
	void setSpeed(int n){
	speed=n;
	}
}
