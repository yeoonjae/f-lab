package study01;

public class Overriding {
	public static void main(String[] args) {
		Overriding overriding = new Overriding();
		
		Parent pa = new Parent();
		pa.dowork();
		
		Child ch = new Child();
		ch.dowork();
		
		Parent pc = new Child();
		pc.dowork(); 
	}
}
