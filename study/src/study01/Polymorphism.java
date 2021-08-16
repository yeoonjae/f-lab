package study01;

public class Polymorphism {
	
	//다형성
	Parent parent = new Parent();
	Child child = new Child();
	
	Parent downCasting = (Parent)new Child();
	Child upCasting = (Child)new Parent();
	
	
	
}

