import java.util.*;

class Insertion {

    int a[] = new int[5];

    void getdata() {                          //For Input
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number");
            a[i] = s1.nextInt();

        }

    }
    void putdata(){                           //Galat hai
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
void sort(){
    int i,val,j;
    for(i=1;i<5;i++){
        val =a[i];
        j=i-1;
        while(val<a[j]){
            a[j+1]=a[j];
            j--;
            if(j==-1)
            break;}
a[j+1]=val;
        }
    }
}
public class Insertionsort{
    public static void main(String[] args) {
        Insertion a1=new Insertion();
        a1.getdata();
       // System.out.println("Unsorted Array");
        a1.putdata();
        a1.sort();
        //System.out.println("Sorted Array");
        //a1.putdata();
    }
    
}

