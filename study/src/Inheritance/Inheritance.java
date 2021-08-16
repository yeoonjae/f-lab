package Inheritance;

public class Inheritance {

    public class ParentClass{
        String parent = "I am parent Class";
        
        public void Parent(){
            System.out.println("I am ParentClass.Parent()");
        }
    }
    
    public class ChildClass extends ParentClass{
        String child = "I am child Class";
        
        public void Child(){
            Parent();
            System.out.println(parent);
            System.out.println("I am ChildClass.Child()");
            System.out.println(child);
        }
    }
    
    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        ChildClass child = inheritance.new ChildClass();
        child.Child();
    }
    
}
