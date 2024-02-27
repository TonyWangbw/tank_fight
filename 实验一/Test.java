class CPU{
	int speed;
	int getSpeed(){
	return speed;
}
	void setSpeed(int m){
	speed=m;
}
}

class HardDisk{
	int amount;
	int getAmount(){
	return amount;
}
	void setAmount(int m){
	amount=m;
}
}	

class PC{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU a){
	cpu=a;
}
	void setHardDisk(HardDisk a){
	HD=a;
}
	void show(){
	System.out.println("ËÙ¶È£º"+cpu.getSpeed());
	System.out.println("ÈÝÁ¿£º"+HD.getAmount());
}
}

public class Test{
public static void main(String args[]){
	CPU cpu=new CPU();
	cpu.setSpeed(2200);
	HardDisk disk= new HardDisk();
	disk.setAmount(200);
	PC c=new PC();
	c.setCPU(cpu);
	c.setHardDisk(disk);
	c.show();
}
}