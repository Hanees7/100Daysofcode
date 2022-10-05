abstract class Parent1{
    public Parent1(){
        System.out.println("i am a constructor");
    }
    public void hello(){
        System.out.println("hello");

    }
    abstract public void greet();
    abstract public void greet2();

}
class Child2 extends Parent1{
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet2(){
        System.out.println("good morning");
    }
}


abstract class Child3 extends Parent1{
    public void th(){
        System.out.println("i am good");
    }
}

public class chw53 {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.greet();
    }
}
