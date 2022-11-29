public class Alpha45 {
public static boolean isprime(int a){

    if(a==2){
    return true;
}
for(int i=2;i<=a-1;i++){
if(a%i==0){
return false;
}
}
return true;
}
    public static void primesum(int n){
for(int i=2;i<=n;i++){
if(isprime(i)){
    System.out.print(i+" ");
}
}
System.out.println(" ");
   }
   public static void main(String[] args) {
    primesum(20);
   }
}
    
