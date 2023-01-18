package Chapter33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

//바이트 스트림 생성 (NIO.2 기반)
class DataFilterOutputStreamNewVer {
    public static void main(String[] args) {
        Path fp = Paths.get("data.dat");

        try(DataOutputStream out = 
                 new DataOutputStream(Files.newOutputStream(fp))) {
            out.writeInt(370);
            out.writeDouble(3.14);
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}