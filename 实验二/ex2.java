abstract class Animal{			
	 public abstract void cry();
	 public abstract String getAnimalName();
}

class Simulator {
	public void playSound(Animal a){
	System.out.print("叫声是：");
	a.cry();
	System.out.println("物种是:"+a.getAnimalName());
}
}

class Dog extends Animal{
	public void cry(){
	System.out.println("汪汪");
}
	public  String getAnimalName(){	
		return "狗";
		}
}
 

class Cat extends Animal{
	public void cry(){
	System.out.println("喵喵");
}	
	public String getAnimalName(){	
		return "猫";
		}
}


public class ex2 {
	public static void main(String args[]) {
		Simulator simulator=new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
		}
}