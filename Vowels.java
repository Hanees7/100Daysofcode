import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        char name;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter An Alphabet");
        name=s1.next().charAt(0);
        if(name=='a' ||name=='e'|| name=='i'||name=='o'||name=='u'||name=='A'
         ||name=='E'|| name=='I'||name=='O'||name=='U')
         {
            System.out.println("It is Vowel");
         }
         else{
            System.out.println("It is a Consonant");
         }
    }
}
