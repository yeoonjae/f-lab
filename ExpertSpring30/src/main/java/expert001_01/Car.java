package expert001_01;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
//		tire = new KoreaTire();
//		tire = new AmericaTire();
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "������ Ÿ�̾� : "+tire.getBrand();
	}
}
