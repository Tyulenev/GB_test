package ru.GB.Java2.Lesson5.HW;



public class Java2Lesson5HW {
    public class J2L2HW {

    }

    static final int size = 10000000; //10kk
    static final int h = size/2;


    public static void meth1()  //Без многопоточности
    {
        float[] arr = new float[size];
        long a = 0;
        a = System.currentTimeMillis();
        for (float fl_var: arr) {
            fl_var  = 1;
        }
        System.out.println("Method 1. Time working app (set 1) in ms - " + (System.currentTimeMillis()- a));

        for (int i = 0; i < size; i++) {
            arr[i]  = (float)(arr[i] *Math.sin(0.2f + i/5)*Math.cos(0.2f + i/5)*Math.cos(0.4f + i/2));
        }
        System.out.println("Method 1. Time working app (set formula) in ms : " + (System.currentTimeMillis()- a));
    }

    public static void meth2()  //с многопоточностью
    {
        float[] arr = new float[size];
        float[] arr_result = new float[size];
        long a = 0;
        a = System.currentTimeMillis();
        for (float fl_var: arr) {
            fl_var  = 1;
        }
        //System.out.println("Method 2. Time working app (set 1) in ms - " + (System.currentTimeMillis()- a));
        //деление массива на 2
        float a1[] = new float[h];
        float a2[] = new float[h];

        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread th1 = new Thread(()->{
            for (int i = 0; i < h; i++) {
                a1[i]  = (float)(a1[i] *Math.sin(0.2f + i/5)*Math.cos(0.2f + i/5)*Math.cos(0.4f + i/2));
            }

            for (int i = 0; i < h; i++) {
                arr[i] = a1[i];
                //System.out.println("arr[" + i + "] = " + arr[i]);
            }
        });

        Thread th2 = new Thread(()->{
            for (int i = 0; i < h; i++) {
                a2[i]  = (float)(a2[i] *Math.sin(0.2f + (i+h)/5)*Math.cos(0.2f + (i+h)/5)*Math.cos(0.4f + (i+h)/2));
            }

            for (int i = 0; i < h; i++) {
                arr[i+h] = a2[i];
                //System.out.println("arr[" + i + "] = " + arr[i]);
            }
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Method 2. Time in ms : " + (System.currentTimeMillis()- a));
        System.out.println("End method 2");
    }



    public static void main(String[] args) {
        meth1();



        meth2();

        System.out.println("END MAIN");
    }
}
