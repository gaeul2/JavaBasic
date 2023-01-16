package Chapter18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOExceptionEx {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\javaBasic\\Simple.txt");
        BufferedWriter writer = null;

        try {
            writer = Files.newBufferedWriter(file); //IOException 발생가능
            writer.write('A'); //IOException 발생가능
            writer.write('Z'); //IOException 발생가능

            if(writer != null)
                writer.close(); //IOException 발생가능

        } catch (IOException e) { // Exception을 상속하는 예외는 반드시 처리해야함. 안그럼 컴파일 오류남
            e.printStackTrace();
        }
    }
}
