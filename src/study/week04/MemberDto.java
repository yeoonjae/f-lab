package study.week04;

import java.util.Objects;

public class MemberDto {
    private String name;
    private String phone;
    private int age;

    public MemberDto(){}

    public MemberDto(String name, String phone, int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if(this == null) return true;
        if(o == null || getClass() != o.getClass()) return false;
        MemberDto mdto = (MemberDto) o;
        return age == mdto.age
            && Objects.equals(name, mdto.name)
            && Objects.equals(phone, mdto.phone)
            ;
    }

}
