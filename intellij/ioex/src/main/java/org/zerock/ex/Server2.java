package org.zerock.ex;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;

public class Server2 {

    public static void main(String[] args) throws Exception {



        ServerSocket serverSocket = new ServerSocket(9999); //Blocked IO

        System.out.println("Ready");

        for(int i=0; i < 10; i++){

            Socket client = serverSocket.accept();//소켓연결

            System.out.println(client);
            //누군가 외부에서 연결이 들어와야 실행되기 시작

            File file = new File("C:\\Users\\stell\\Desktop\\210727김용환\\Layout.html");
            OutputStream out = client.getOutputStream();

            out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
            out.write(new String("Cache-Control: private\r\n").getBytes());
            out.write(new String("Content-Length: "+file.length()+"\r\n").getBytes());
                out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());//mime type

            Files.copy(file.toPath(), out);


        }//end for

    }
}
