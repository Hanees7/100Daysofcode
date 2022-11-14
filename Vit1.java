 import java.util.*;

 class A {
    String S1="new";
}
class B extends A implements E{
public void bb(){
System.out.println("HEllo");
}
}
class C extends B{

}
interface D{
public void bb();
}
interface E extends D{

}
public class Vit1{
    public static void main(String[] args) {
        B d=new B();
        d.bb();
        String C = d.S1;
        System.out.println(C);
    }
}