class Test {
    static int marks;

    void setMarks(int mark) {
        this.marks = mark;
    }
}

public class OopsQus2 {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setMarks(97);

        System.out.println(t1.marks); // Both Right call by making the object of class
        System.out.println(Test.marks); // Both Right bcz its Static can b call by using class.variable
    }
}
