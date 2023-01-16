package Chapter10;

public class InstCnt {
    /*클래스변수 혹은  static변수.
    이 클래스에만 국한 되지 않음. 다른 클래스들과 공유하는 변수
    하지만 자리를 빌려서 들어오는것이니
    접근 수준 지시자에 따르게됨
     */
    static int instNum = 0;

    public InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성 : " + instNum);
    }
}
class ClassVar{
    public static void main(String[] args) {
        InstCnt cnt1 = new InstCnt();
        InstCnt cnt2 = new InstCnt();
        InstCnt cnt3 = new InstCnt();

    }
}
