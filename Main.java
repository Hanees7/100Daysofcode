class cpyconstt {
    int a; String b;
    cpyconstt(int ptr , String str){
        
         a=ptr; b=str;
         System.out.println(a+" "+b);
    }
    cpyconstt(cpyconstt ref){
            a=ref.a;
            b=ref.b;
            System.out.println(a+" "+b);
    }
}
public class Main{

    public static void main(String[] args) {
        cpyconstt g=new cpyconstt(2,"hanee");  
        cpyconstt g1=new cpyconstt(g);       
    }
}
