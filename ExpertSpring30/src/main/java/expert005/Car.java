package expert005;

import javax.annotation.*;

public class Car {

	@Resource
	Tire tire;
	
	public String getTireBrand() {
		return "������ Ÿ�̾� : "+ tire.getBrand();
	}
	
	
}
