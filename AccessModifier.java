public class AccessModi {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.User = "Hanees";
        System.out.println(b1.User);
        b1.pas(786);
    }
}
class Bank {
    String User;
    private int pass;

    void pas(int a) { // public void pas(int a)
        pass = a;
        System.out.print(pass);
    }

}
