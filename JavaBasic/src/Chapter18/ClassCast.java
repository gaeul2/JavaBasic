package Chapter18;

public class ClassCast {

    public static void main(String[] args) {
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard) pbd1;

        System.out.println("역참조 불가");
        try {
            Board bd3 = new Board();
            PBoard pbd4= (PBoard)bd3;
        }
        catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
class Board {}
class PBoard extends Board {}
/*Pboard가 Board클래스를 상속받음
 */
