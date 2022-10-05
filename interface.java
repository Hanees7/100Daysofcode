interface vehical {
    String name="TVS";
    //int speed=100;

    void start();
    void stop();
    default void color(){
        System.out.println("red");
    }    
    static void speed(){
        System.out.println("speed is 100km/h");
    }
    
}
class Customer implements vehical{
    
    public void start()
    {
    System.out.println("start(): insert key and start: "+name);
}
public void stop(){
    System.out.println("Stop(): exit key:  ");
}
public static void main(String[] args) {
    Customer c1=new Customer();
    c1.start();
    c1.stop();
   // System.out.println(speed);
    c1.color();
    vehical.speed();
}
}