import java.util.Scanner;
public class experiment2{
  public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	double m[]=new double[6];
	for(int i=0;i<6;i++){
	  double a = reader.nextDouble();
	  m[i]=a;
	}
	int max=0;
	int min=0;
	for(int i=0;i<6;i++){
	  if(m[max]<m[i])
	    max=i;
	  if(m[min]>m[i])
	    min=i;		
	}
	System.out.println("���ֵ��"+"����"+m[max]+"  "+"λ��"+(max+1));
	System.out.println("��Сֵ��"+"����"+m[min]+"  "+"λ��"+(min+1));
}

}