package polymorphism;

public class Casting {
	public static void main(String[] args) {
//		Car car = null;
//		Sorento sorento = new Sorento();
//		Sorento sorento2 = null;
//		
//		sorento.drive();
//		sorento.sunroof();
//		car = sorento;	//업캐스팅 (생략되어있음) 자식클래스->부모클래스
//		
//		sorento2 = (Sorento)car;	// 다운캐스팅 부모클래스->자식클래스
//		sorento2.sunroof();
		Sorento c = new Sorento();
		
		if(c instanceof Sorento) {
			System.out.println("This is a Sorento instance");
		}
		
		if(c instanceof Car) {
			System.out.println("This is a Car instance");
		}
		
		if(c instanceof Object) {
			System.out.println("This is a Object instance");
		}
		
		System.out.println(c.getClass().getName());	// 클래스의 이름 출력
		
	}
	
	void dowork(Car c) {
		if(c instanceof Sorento) {
			Sorento so = (Sorento)c;
			so.sunroof();
		}else {
			K5 k5 = (K5)c;
			k5.radio();
			
		}
	}
}
