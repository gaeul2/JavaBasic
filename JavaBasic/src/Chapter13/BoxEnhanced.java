package Chapter13;

public class BoxEnhanced {
    private int boxNum;
    private String content;

    public BoxEnhanced(int boxNum, String content){
        this.boxNum = boxNum;
        this.content= content;
    }

    public int getBoxNum() {
        return boxNum;
    }

    public void setBoxNum(int boxNum) {
        this.boxNum = boxNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String toString(){
        return content;
    }
}
class TestBoxEnhanced {
    public static void main(String[] args) {
        BoxEnhanced[] ar = new BoxEnhanced[5];
        ar[0] = new BoxEnhanced(101, "Coffee");
        ar[1] = new BoxEnhanced(102, "Computer");
        ar[2] = new BoxEnhanced(103, "Apple");
        ar[3] = new BoxEnhanced(104, "Dress");
        ar[4] = new BoxEnhanced(105, "Fairy-tale book");

        for (BoxEnhanced e : ar){
            if (e.getBoxNum() == 105)
                System.out.println(e);
        }
    }
}
