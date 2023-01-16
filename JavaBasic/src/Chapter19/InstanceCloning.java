package Chapter19;

public class InstanceCloning {
    public static void main(String[] args) {
        Point org = new Point(3, 5);
        Point cpy;

        try {
            //clone()의 반환값이 Object이므로 형변환
            cpy = (Point)org.clone();
            System.out.println("----변경전----");
            org.showPosition();
            cpy.showPosition();

            //일부러 값바꿔봄
            System.out.println("----변경 후----");
            cpy.setxPos(10);
            cpy.setyPos(5);
            org.showPosition();
            cpy.showPosition();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

class Point implements Cloneable {
    private int xPos;
    private int yPos;

    public Point(int x, int y){
        xPos = x;
        yPos = y;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void showPosition() {
        System.out.printf("[%d, %d]", xPos, yPos);
        System.out.println();
    }

    @Override //public으로 바꾸는이유. Object는 java.lang패키지에 있고 지금 현재 클래스와 위치가 다름.
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
