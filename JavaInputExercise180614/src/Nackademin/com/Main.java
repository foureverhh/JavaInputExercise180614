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
    }
}
