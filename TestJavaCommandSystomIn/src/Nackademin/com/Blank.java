package Nackademin.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blank {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
       StringBuilder output = new StringBuilder();
        while (true){
            String input = bufferedReader.readLine();
            if(input.isEmpty()){
               break;
            }
           output.append(input.replace("f","x"));
           // for(int i = 0; i < input.length(); i++)
           //     if(input.charAt(i) == ' ')
           //         n++;
        }
        System.out.println("The new text is "+output);
    }
}
