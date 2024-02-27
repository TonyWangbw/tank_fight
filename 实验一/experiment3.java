class d{
     int add(int a,int b){
       return a+b;
}
     double add(double a,double b,double c){
       return a+b+c;
}
}

public class experiment3 {
  public static void main(String args[]){
	d A=new d();
	System.out.println(A.add(1,10));
	System.out.println(A.add(1.2,1.5,9.91));
}
}

