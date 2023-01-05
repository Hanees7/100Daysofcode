public class PrintSubArrays {
 public static void SubArray(int Number[]){
    for(int i=0; i<Number.length; i++){
        int start = i;
for(int j=i; j<Number.length; j++){
    int end = j;
    for(int k=start; k<=end; k++){  //print
System.out.print(Number[k]+ " ");  //subarray
    }
    System.out.println( );
}
System.out.println();
}
 }  
 public static void main(String[] args) {
    int Number[]={1, 3, 5, 7, 9};
    SubArray(Number);
 } 
}
