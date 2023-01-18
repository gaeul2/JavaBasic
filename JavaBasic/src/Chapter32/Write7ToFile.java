package Chapter32;

import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Write7ToFile {
    public static void main(String[] args) throws IOException {
        // 출력 스트림 생성
        OutputStream out = new FileOutputStream("data.dat");
        out.write(7); //7을 저장
        out.close();  // 스트림 종료
    }
}