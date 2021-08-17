package study01;

public class Overloading {
	// 매개변수 미존재 
    void play() {
		System.out.println("매개변수 미존재");
	}

	// 매개변수 int형 1개
	void play(int a) {
		System.out.println("매개변수 int형 1개 존재");
	}
    
	// 매개변수 String형 1개
	void play(String game) {
		System.out.println("매개변수 String형 1개 존재");
	}
    
	// 매개변수 int형 1개,String형 1개
	void play(int a,String name) {
		System.out.println("매개변수 int형 1개,String 형 1개");
	}
}
