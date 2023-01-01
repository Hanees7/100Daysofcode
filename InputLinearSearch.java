import java.util.*;
public class Practice {

public static int linearly(int marks[],int key){


    for(int i=0;i<marks.length;i++){
        if(marks[i]==key){
            return i;

        }
    }
return -1;
}
   
    public static void main(String[] args) {
        int marks []= new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 Values");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
       
   // System.out.println("The value of index 3 is = KEY");
        int key=marks[3];

        int index=linearly(marks,key);
        if(index== -1){
            System.out.println("Search index number not found");
        }
        else{
            System.out.println("The index number : "+index+" and Value is : "+marks[3]);
        }
       
    }
}
