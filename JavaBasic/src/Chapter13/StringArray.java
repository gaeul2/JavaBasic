package Chapter13;

public class StringArray {
    public static void main(String[] args) {
        String[] sr = new String[7];
        sr[0] = new String("Java");//4
        sr[1] = new String("C");//1
        sr[2] = new String("Python");//6
        sr[3] = new String("PHP");//3
        sr[4] = new String("Kotlin");//6
        sr[5] = new String("Lunch");//5
        sr[6] = new String("Dinner");//6

        int cnum = 0;
        for (int i = 0; i<sr.length; i++){
            cnum += sr[i].length();
        }
        System.out.println("총 문자의 수 : " + cnum);

    }
}
