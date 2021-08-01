package org.zerock.ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class FileCopy1 {

    //bad code
    public static void main(String[] args) throws Exception {

        //사이트가서 f12 > network > 페이지새로고침 > img > open in new tab > url확인
        URL url = new URL("https://cdn.011st.com/11dims/resize/600x600/quality/75/11src/pd/20/2/7/5/7/6/2/YANxG/3228275762_B.jpg");
        InputStream in = url.openStream();

        System.out.println(in);
        long start = System.currentTimeMillis();

        OutputStream out =new FileOutputStream("C:\\Users\\stell\\luppycopy.jpg");

        while (true) {
            int data = in.read();

            if(data == -1){ break; }
            out.write(data);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
