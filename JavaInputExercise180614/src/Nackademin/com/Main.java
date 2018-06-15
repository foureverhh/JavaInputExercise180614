package Nackademin.com;

import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        boolean getANumber = true;
        //BufferedReader
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String s = input.readLine();
        System.out.println("Hi "+s+" !");
        while(true) {
            System.out.print("Amount?");
            System.out.flush();
            s = input.readLine();
            if(s.isEmpty()) {
                System.out.println("User has entered ctrl+z");
                break;
            }
            double b = Double.parseDouble(s);

            System.out.print("Interest?");
            System.out.flush();
            s = input.readLine();
             if(s == null)
             break;
            double i = Double.parseDouble(s);

            System.out.print("Years?");
            System.out.flush();
            s = input.readLine();
            if(s == null)
            break;
            double y = Double.parseDouble(s);

            double m = b * i * y;
            System.out.println("Money you get would be: " + m
            );
        }

        Locale.setDefault(new Locale("sv","SE"));
        while (getANumber) {
        try {
        String getInput = JOptionPane.showInputDialog("Input a number here:");
        double number = Double.parseDouble(getInput);
        System.out.println(number);
        getANumber = false;
        }catch (Exception e){
        System.out.println("Try again with a number!");
        }
        */

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a group of numbers, then end with ctrl-z");
        int sum = 0;
        while (scanner.hasNextDouble()){
            double d = scanner.nextDouble();
            sum += d;
        }
        System.out.println("Sum is "+ sum);
        String str = "Hello World! 3 + 3.0 = 6.0 true";
        scanner = new Scanner(str);
        System.out.println(""+ scanner.nextLine());
        Locale locale = new Locale("sv","SE");
        scanner.useLocale(locale);
        System.out.println(""+scanner.locale());
        scanner.close();
        */
        testPrintWriter1();
        testPrintWriter2();
        testPrintWriter3();
        testPrintWriterApi();

    }

    private static void testPrintWriter1(){
        //Test PrintWrite
        String CONTENT_ONE = "Hello";
        try {//Create a file object
        File fileTestPrintWriter = new File("testPrintWriter180615.txt");
        //Create FileOutputStream object
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(fileTestPrintWriter));
            //write the string to the PrintWriter
            printWriter.write(CONTENT_ONE);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void testPrintWriter2(){
        String content = "Hello 2";

        try {
            File file = new File("testPrintWriter180615.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(content);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testPrintWriter3(){
        String content = "Hello3";
        String content1 = "Append";
        try {
            PrintWriter printWriter = new PrintWriter("testPrintWriter180615.txt");
            printWriter.write(content);
            printWriter.append(content1);
            printWriter.write(" write a string directly");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void testPrintWriterApi(){
        try {
            PrintWriter printWriter = new PrintWriter("TestPrintWriterApi.txt");
            printWriter.println("This is from println");
            printWriter.write(0x41);
            printWriter.print(0x41);
            printWriter.append('B')
                    .append("CDEF")
                    .write("G\n");
            String str = "HIGK";
            int num = 5;
            printWriter.printf("%s is %03d",str,num);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
