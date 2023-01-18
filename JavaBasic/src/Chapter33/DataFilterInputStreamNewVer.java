package Chapter33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.DataInputStream;

//바이트 스트림 읽기 (NIO.2 기반)
class DataFilterInputStreamNewVer {
    public static void main(String[] args) {
        Path fp = Paths.get("data.dat");
        
        //스트림 생성방법이 Files.newInputStream(fp)로 세련되어짐
        try(DataInputStream in = 
                 new DataInputStream(Files.newInputStream(fp))) {
            int num1 = in.readInt();
            double num2 = in.readDouble();
        
            System.out.println(num1);
            System.out.println(num2);
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}