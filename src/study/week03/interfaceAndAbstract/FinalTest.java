package study.week03.interfaceAndAbstract;

public class FinalTest {
    // 인스턴스 변수 또는 클래스 변수는 final로 선언 시 반드시 초기화를 같이 해주어야 한다.
    final int instanceVariable = 1; // 에러안남
//    final int instanceVariable2; // 에러

    // 매개변수는 이미 초기화 되어서 넘어오기 때문에 메소드 내에서 변경이 안된다.
    // final이 붙은 지역변수는 선언만 하는 것이 가능, 하지만 한 번 초기화 후 변경은 안된다.
    public void method(final int parameter){
        final int localVariable; // 에러안님
//        parameter = 1; // 이미 값이 할당되어 넘어왔기 때문에 다시 값 할당 안됨
        localVariable = 1; // 에러안남
//        localVariable = 3; // 에러 - 이미 초기화가 되었기 때문에 다시 값 할당 안됨

    }

    public class FinalReference{
        final MemberDto memberDto = new MemberDto();

        public void main(String[] args) {
            FinalReference referenceType = new FinalReference();
//            memberDto = new MemberDto();    // 에러
            memberDto.name = "tester";  // 정상
        }

    }

}
