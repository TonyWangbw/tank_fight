abstract class Animal{			
	 public abstract void cry();
	 public abstract String getAnimalName();
}

class Simulator {
	public void playSound(Animal a){
	System.out.print("�����ǣ�");
	a.cry();
	System.out.println("������:"+a.getAnimalName());
}
}

class Dog extends Animal{
	public void cry(){
	System.out.println("����");
}
	public  String getAnimalName(){	
		return "��";
		}
}
 

class Cat extends Animal{
	public void cry(){
	System.out.println("����");
}	
	public String getAnimalName(){	
		return "è";
		}
}


public class ex2 {
	public static void main(String args[]) {
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
		}
}