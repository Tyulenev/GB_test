package ru.GB.Java3.Lesson3.Lesson;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class J3L3MainClass {
    public static void main(String[] args) throws Exception {
        //Работа с объектом File
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        /*
        File file = new File("C:/proj/ttt/1");
        //file.mkdir();
        System.out.println("Lenght: " + file.length());
        System.out.println(file.isDirectory());
        System.out.println(Arrays.toString(file.list()));
*/
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //FileInput/outputStream
        /*
        try (FileInputStream in1 = new FileInputStream("1.txt")){
            long t = System.currentTimeMillis();
            int x;
            //in.available() - возвращает количество байт доступных для чтения

            System.out.println(in1.available()); //Кол-во байт доступных для чтения

            byte[] buf = new byte[128]; // Для ускорения работы "буфер"
            StringBuilder s = new StringBuilder();

            while ((x = in1.read(buf)) != -1)  //-1 - файл закончился
            {
                for (byte b1:buf) {
                    s.append((char) b1);
                }
            }
            System.out.print(s);

//            while ((x = in.read()) != -1)  //-1 - файл закончился
//            {
//                System.out.print((char) x);
//            }
            System.out.println("\n" + (System.currentTimeMillis() - t));
        } catch (IOException e) {
            e.printStackTrace();
        }
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
*/

        /*
        //InputStreamReader - чтение с кодировкой
        InputStreamReader isr = new InputStreamReader(new FileInputStream("1.txt"), "UTF-8");
        char[] chars = new char[20];
        isr.read(chars);
        System.out.println(chars);
         */


        //BufferedInputStream
        /*
        byte[] barr1 = {1,2,3,4,5,6,7};
        BufferedInputStream inBuf1 = new BufferedInputStream(new ByteArrayInputStream(barr1), 2);
        byte[] outB = new byte[3];

        while (inBuf1.available()>0) {
            inBuf1.read(outB);
            System.out.println(Arrays.toString(outB));
        }
        */


        //DataInputStream - позволяют писать сообщения в UTF-8
        //DataInputStream dis1 = new DataInputStream();

        //PipedInputStream - связываение нескольких потоков между собой

        /*
        //SequenceInputStream - Упаковка нескольких потоков в 1
        ArrayList<InputStream> al1 = new ArrayList<>(Arrays.asList(new FileInputStream("1.txt"), new FileInputStream("2.txt"), new FileInputStream("3.txt"))); //Упаковка потоков

        SequenceInputStream sis1 = new SequenceInputStream(Collections.enumeration(al1)); //Упаковка нескольких потоков в 1
        int x;
        while ((x = sis1.read()) != -1) {
            System.out.print((char) x);
        }
*/

        //Сериализация/десериализация
        J3L3_Zachetka z = new J3L3_Zachetka(1012);
        J3L3_Sudents student1 = new J3L3_Sudents("BOB2", 30, z);
        J3L3_Sudents student2 = new J3L3_Sudents("BOB1", 15, z);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stud.ser"));
        out.writeObject(student1);
        out.writeObject(student2);
        out.close();

        ObjectInputStream objInS1 = new ObjectInputStream(new FileInputStream("stud.ser"));
        J3L3_Sudents stdIn1 = (J3L3_Sudents) objInS1.readObject();
        J3L3_Sudents stdIn2 = (J3L3_Sudents) objInS1.readObject();
        objInS1.close();

        stdIn1.info();
        stdIn2.info();
        System.out.println("stdIn1 - " + stdIn1.z.getId());
        System.out.println("stdIn2 - " + stdIn2.z.getId());
    }
}
