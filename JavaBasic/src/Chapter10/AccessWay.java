package Chapter10;

public class AccessWay {
    static int num = 0;

    AccessWay() { incrCnt(); }
    void incrCnt(){
        num++;
    }
}

class ClassVarAccess{
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++; // 외부에서 인스턴스 이름을 통한 접근(권하지 않음)
        AccessWay.num++; // 클래스변수이므로 이렇게 사용하길 권고
        System.out.println("num = " + AccessWay.num);
    }
}

