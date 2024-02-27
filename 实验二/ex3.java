abstract class Employee{
	public abstract double earning();
}

class YearWorker extends Employee{
	public double earning(){
		return 100000.0;
}
}

class MonthWorker extends Employee{
	public double earning(){
		return 10000.0*12;
}
}

class WeekWorker extends Employee{
	public double earning(){
		return 1000.0*52;
}
}
class Company{
	Employee[] employee;
	double salaries=0;
	Company(Employee[] a){
		employee=a;
}
		

	public double salariespay(){
		for(int i=0;i<29;i++)
		this.salaries+=this.employee[i].earning();
		return this.salaries;
}
}
public class ex3 {
	public static void main(String args[]) {
		Employee[] a=new Employee[29];
		for(int i=0;i<8;i++)
			a[i]=new YearWorker();

		for(int i=8;i<17;i++)
			a[i]=new MonthWorker();

		for(int i=17;i<29;i++)
			a[i]=new WeekWorker();

		Company b=new Company(a);
		System.out.println(b.salariespay());
		}
}