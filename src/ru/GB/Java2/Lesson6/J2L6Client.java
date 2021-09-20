package ru.GB.Java2.Lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class J2L6Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8189)){
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            Scanner sc = new Scanner(System.in);
            while(true) {
                String str = sc.nextLine();
                out.writeUTF(str);
                if (str.equals("end")) break;
                System.out.println("From server: " + in.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
