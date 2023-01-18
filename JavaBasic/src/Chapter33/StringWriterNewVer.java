package Chapter33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

//문자스트림의 생성(NIO.2기반)
//32챕터의 BufferedDataInputStream와 비교해보면 진짜 간편해짐
class StringWriterNewVer {
    public static void main(String[] args) {
        String ks = "공부에 있어서...";
        String es = "Life is long if you know how to use it.";

        Path fp = Paths.get("String.txt");

        //버퍼가 달린 스트림을 한번에 생성
        try(BufferedWriter bw = Files.newBufferedWriter(fp)) {   
            bw.write(ks, 0, ks.length());
            bw.newLine(); //개행 표시
            bw.write(es, 0, es.length()); 
        }
        catch(IOException e) {
            e.printStackTrace();       
        }
    }
}

