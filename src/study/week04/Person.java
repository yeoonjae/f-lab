package study.week04;


import java.util.Objects;

// equals()와 hashcode() 동일성과 동등성에 대해서 알아보자.
// equals()는 두 객체의 '내용'이 같은지를 알아보는 비교연산자 = 동등성
// hashcode()는 두 객체가 같은 객체인지를 알아보는 비교연산자 = 동일성
public class Person {

    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == null) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age
            && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

}
