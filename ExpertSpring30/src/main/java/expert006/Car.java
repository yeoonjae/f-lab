package expert006;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("tire1")
	Tire tire;
	
	public String getTireBrand() {
		return "������ Ÿ�̾� : "+ tire.getBrand();
	}
	
	
}
