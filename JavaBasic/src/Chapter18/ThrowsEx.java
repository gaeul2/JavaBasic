package Chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ThrowsEx {
    public static void main(String[] args) {
        try{
            md1(); //여기서 예외처리하고 md1, md2에서는 throw로 여기로 넘길 수 있음
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void md1() throws IOException{ // 여기말구 나 실생시킨곳에서 예외처리할거야~
        md2();
    }

    public static void md2() throws IOException{ //IOException예외발생하면 나 실행시킨곳으로 던질게라고 명시
        Path file = Paths.get("C:\\javaBasic\\Simple.txt");
        BufferedWriter writer = null;

        writer = Files.newBufferedWriter(file); //IOException 발생가능
        writer.write('A'); //IOException 발생가능
        writer.write('Z'); //IOException 발생가능

        if(writer != null)
            writer.close(); //IOException 발생가능

    }


}
