package ru.GB.Java2.Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintWriter;

//server
public class J2L6prog1 {



    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189);) {
            Socket socket = null;
            System.out.println("Сервер ожидает подключения");
            socket = serverSocket.accept();
            System.out.println("Клиент подключился");
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            while (true) {
                String str = in.readUTF();
                if (str.equals("end")) {
                    out.writeUTF("ServerAns: End session");
                    out.flush();
                    break;
                }

                out.writeUTF("echo: " + str);
                System.out.println(str);
                out.flush();

            }


        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
