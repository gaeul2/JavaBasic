package Chapter32;

import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class BufferedFileCopier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("대상 파일: ");
        String src = sc.nextLine();
    
        System.out.print("사본 이름: ");
        String dst = sc.nextLine();

        try(InputStream in = new FileInputStream(src) ;
            OutputStream out = new FileOutputStream(dst)) {
            // 1024바이트 -> 1K버퍼 생성
            byte buf[] = new byte[1024];
            int len;

            while(true) {
                //배열buf로 데이터를 읽어들이고 더이상 읽어들일 데이터 없으면 -1반환
                len = in.read(buf);             
                if(len == -1)
                    break;             
                out.write(buf, 0, len); //len바이트만큼 버퍼에 있는 데이터를 저장한다.
            }
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}