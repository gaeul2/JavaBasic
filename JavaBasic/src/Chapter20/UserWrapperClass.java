package Chapter20;

public class UserWrapperClass {
    public static void showData(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer iInst = new Integer(3);
        showData(iInst);
        showData(new Double(7.15));
    }
}
