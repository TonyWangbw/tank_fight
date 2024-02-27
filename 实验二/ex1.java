class Bank{
	int savedMoney;			
	int year;					
	double rate_year;			
	double interest;			
	double computerInterest() {	
		interest=year*rate_year*savedMoney;
		return interest;
		}
	Bank(int a,int b,double c){	
		savedMoney=a;
		year=b;
		rate_year=c;
		}
}

class ConstructionBank extends Bank{
	double year;							
	double rate_day;						
	double computerInterest() {				
		double t=super.computerInterest();
		interest=t+(year*1000%1000)*rate_day*savedMoney;
		return interest;
		}
	ConstructionBank(int a,double b,double c,double d){
		super(a,(int)b,c);
		year=b;
		rate_day=d;
		}
}

class BankDalian extends Bank{
	double year;							
	double rate_day;						
	double computerInterest() {				
		double t=super.computerInterest();
		interest=t+(year*1000%1000)*rate_day*savedMoney;
		return interest;
		}
	BankDalian(int a,double b,double c,double d){
		super(a,(int)b,c);
		year=b;
		rate_day=d;
		}
}

public class ex1 {
	public static void main(String[] args) {
		ConstructionBank C=new ConstructionBank(8000,8.236,0.1,0.02);
		BankDalian B=new BankDalian(8000,8.236,0.2,0.01);
		System.out.println(C.computerInterest());
		System.out.println(B.computerInterest());
		}
}