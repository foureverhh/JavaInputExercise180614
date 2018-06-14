package Nackademin.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String s = input.readLine();
        System.out.println("Hi "+s+" !");

        System.out.print("Amount?");System.out.flush();
        s = input.readLine();
        double b = Double.parseDouble(s);
        System.out.print("Interest?");System.out.flush();
        s = input.readLine();
        double i = Double.parseDouble(s);
        System.out.print("Years?");System.out.flush();
        s = input.readLine();
        double y = Double.parseDouble(s);
        double m = b*i*y;
        System.out.println("Money you get would be: "+ m);
    }
}
