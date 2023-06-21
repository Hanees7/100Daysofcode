public class AbsTractInterfaces {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.moves();
    }
}
interface ChessPlay {
    //fx Blueprint
    void moves();
}
class Queen implements ChessPlay {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlay {
    public void moves() {
        System.out.println("up, down, left, right, diagonal");
    }
}

class King implements ChessPlay {
    public void moves() {
        System.out.println("up, down, left, right, Diagonal by 1");
    }
}
