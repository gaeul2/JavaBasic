package Chapter33;

import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

class FileCopierVerNIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("대상파일: ");
        Path src = Paths.get(sc.nextLine());
        
        System.out.print("사본 이름: ");
        Path dst = Paths.get(sc.nextLine());

        // 하나의 버퍼생성
        ByteBuffer buf = ByteBuffer.allocate(1024);
 
        /* try에서 두개의 채널 생성
        ifc 는 read, 즉 input을 위한 채널
        ofc 는 write, 즉 output을 위한 채널(없으면 생성하기 위해 Create도 줌
         */
        try(FileChannel ifc =
                FileChannel.open(src, StandardOpenOption.READ); 
            FileChannel ofc = 
                FileChannel.open(dst, StandardOpenOption.WRITE, 
                                      StandardOpenOption.CREATE)) {
            int num;

            while(true) {
                num = ifc.read(buf);    // 채널 ifc에서 버퍼로 읽어들임-이걸 연결이라 표현한것.
                if(num == -1)//읽어들인 데이터가 없다면
                    break; 
                
                buf.flip();     // 모드변환 - 버퍼의 모드를 읽기에서 쓰기로 바꿔주기위해
                ofc.write(buf);     // 버퍼에서 채널 ofc로 데이터전송
                buf.clear();    // 버퍼 비우기
            }
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}

