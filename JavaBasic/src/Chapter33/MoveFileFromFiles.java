package Chapter33;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

class MoveFileFromFiles {
    public static void main(String[] args) throws IOException {
        Path src = Paths.get("C:\\JavaStudy\\Dir1");
        Path dst = Paths.get("C:\\JavaStudy\\Dir2");
        
        // dir1에 있던 파일을 dir2로 옮기라는 건 dir1을 dir2로 바꾸는것
        Files.move(src, dst, StandardCopyOption.REPLACE_EXISTING);
    }
}

