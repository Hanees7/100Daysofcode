public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setTip(7);

        Stu s1 = new Stu();
        System.out.println(s1.getId(125));
    }
}

class Pen {
    private String color;
    private int tipSize;

    // Setter
    void setColor(String col) {
        color = col;
        System.out.println(color);
    }

    void setTip(int tip) {
        tipSize = tip;
        System.out.println(tipSize);
    }
}

// For Getter
class Stu {
    private int id;

    // getter
    int getId(int id) {
        // this keyword specifies the class int variable id not the parameter of
        // function

        return this.id = id;
    }
}
