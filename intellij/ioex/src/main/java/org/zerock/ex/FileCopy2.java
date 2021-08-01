package org.zerock.ex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

//bad code
public class FileCopy2 {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\stell\\luppycopy.jpg");

        Path filePath = file.toPath();

        OutputStream out = new FileOutputStream("C:\\Users\\stell\\luppycopy2.jpg");

        Files.copy(filePath, out);

    }
}
