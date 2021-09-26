package study.week08;

public class Penguin extends Animal {

    public String habitat;

    public void showHabitat(){
        System.out.printf("%s은 %s에 살아!\n",name,habitat);
    }

    // 오버라이딩 (재정의) : 상위클래스의 메소드와 같은 메소드 이름, 같은 인자 리스트
    public void showName(){
        System.out.println("내 이름 알아서 뭐하려구?\n");
    }

    // 오버로딩 (중복정의) : 같은 이름 메소드, 다른 인자 리스트
    public void showName(String yourName) {
        System.out.printf("%s 안녕? 나는 %s라고 해\n",yourName,name);
    }
    
}
