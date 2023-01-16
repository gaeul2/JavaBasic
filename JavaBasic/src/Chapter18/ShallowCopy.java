package Chapter18;

public class ShallowCopy {
    public static void main(String[] args) {
        Rectangle org = new Rectangle(1, 1, 9, 9);
        Rectangle cpy = null;

        try{
            cpy = (Rectangle)org.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        System.out.println("--------복사 후--------------");
        System.out.print("org : ");
        System.out.println(org.toString());
        System.out.print("cpy : ");
        System.out.println(cpy.toString());

        System.out.println("--------org의 upperLeft바꾼 후------");
        org.setUpperLeft(5,5);
        System.out.print("org : ");
        System.out.println(org.toString());
        System.out.print("cpy : ");
        System.out.println(cpy.toString());
    }
}

class Point implements Cloneable{
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

    @Override
    public String toString() {
        return "[xPos=" + xPos +
                ", yPos=" + yPos +
                ']';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Rectangle implements Cloneable {
    private Point upperLeft; //인스턴스를 인스턴스변수로 참조
    private Point lowerRight;

    public Rectangle(int x1, int y1, int x2, int y2){
        upperLeft = new Point(x1, y1);
        lowerRight = new Point(x2, y2);
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(int x, int y) {
        Point uL =  getUpperLeft();
        uL.setxPos(x); uL.setyPos(y);
        this.upperLeft = uL ;
    }

    public Point getLowerRight() {
        return lowerRight;
    }

    public void setLowerRight(Point lowerRight , int x, int y) {
        this.lowerRight = lowerRight;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //깊은 복사시
        Rectangle copy = (Rectangle)super.clone();

        copy.upperLeft = (Point)upperLeft.clone();
        copy.lowerRight = (Point)lowerRight.clone();

        return copy;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", lowerRight=" + lowerRight +
                '}';
    }
}