package Chapter11;

public class StringConncat {
    public static void main(String[] args) {
        String st1 = "Coffee";
        String st2 = "Bread";

        String st3 = st1.concat(st2);
        System.out.println(st3);

        String st4 = "Fresh".concat(st3);
        System.out.println(st4);

        System.out.println(st3.length());
        System.out.println(st4.length());

        System.out.println(st3.substring(0));
        System.out.println(st4.substring(0,5));

        String strEx = "AB".concat("CD").concat("EF");
        System.out.println(strEx);



    }
}
