import javax.sound.midi.Soundbank;

class A1
 {
int a=5,b=10;
public void first (){
    System.out.println("public first method "+ (a+b));
}
private void second(){
    System.out.println("private second method "+(a+b) );
}
protected void third(){
    System.out.println("protected third method "+(a+b));
}
}

class X extends A1{
    X(){
        System.out.println("class X");
    }
    
}

public class inheri{
    public static void main(String[] args) {

       X ob = new X(); 
       ob.first(); 
    //    ob.second(); this method cslling gives an error because this method is 
    //     private so we can't call this method.
       ob.third();    
    }
}
