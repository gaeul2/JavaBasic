package Chapter33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

class FileRandomAccess {
    public static void main(String[] args) {
        Path fp = Paths.get("data.dat");

        // 버퍼생성
        ByteBuffer wb = ByteBuffer.allocate(1024);
        
        wb.putInt(120); //int형 데이터를 버퍼에 저장. 버퍼에는 포인터가 있음
        wb.putInt(240);
        wb.putDouble(0.94); //double형 데이터를 버퍼에 저장
        wb.putDouble(0.75);

        // 하나의 채널 생성 - 채널은 스트림과 달리 양쪽왔다갔다 가능
        try(FileChannel fc = FileChannel.open(fp, 
                               StandardOpenOption.CREATE, 
                               StandardOpenOption.READ, 
                               StandardOpenOption.WRITE)) {
            // 파일에 쓰기
            wb.flip(); //지금 쓰기이면 -> 읽기로 바꿈 이떄 포인터 0으로 옮겨짐
            fc.write(wb);   //채널에다가 wb버퍼에 있던 내용 적음
            //fc채널도 파일을 읽고쓰기위해서 포인터를 가지고 있음

            // 파일로부터 읽기
            ByteBuffer rb = ByteBuffer.allocate(1024); //버퍼 생성
            fc.position(0); //채널의 포지션을 맨 앞으로 이동. 그래야 읽으니까.
            fc.read(rb);//0인덱스 부터 rb에 넣어놓음
            
            // 이하 버퍼로부터 데이터 읽기
            rb.flip(); //rb가 쓰기모드 ->  읽기모드
            System.out.println(rb.getInt());
            rb.position(Integer.BYTES * 2); //버퍼의 포지션 이동
            System.out.println(rb.getDouble());
            System.out.println(rb.getDouble());

            rb.position(Integer.BYTES);    // 버퍼의 포지션 이동
            System.out.println(rb.getInt()); 
        } catch(IOException e) {
            e.printStackTrace();       
        }
    }
}