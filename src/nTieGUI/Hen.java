package nTieGUI;

import java.io.BufferedReader;
import java.awt.Desktop;
import java.io.*;
import java.net.URI;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Hen {
    public void tie(String[] args)
            throws Exception
   {
       Desktop desk = Desktop.getDesktop();
       
       Scanner scan = new Scanner(System.in);
     //User input of length and width
       String numbers;
       try {
    	   numbers = args[0];
       } catch(Exception e) {
    	   System.out.print("Enter the sacred numbers:");
           numbers = scan.nextLine();
       }

       int min = 1;
       int max = 389605;
       String url = "https://nhentai.net/g/"+numbers;
       if(numbers.isEmpty()) {
    	   int numb = ThreadLocalRandom.current().nextInt(min, max + 1);
    	   //System.out.println(numb);
    	   url = "https://nhentai.net/g/"+numb;
       }
       desk.browse(new URI(url));
       scan.close();
}
}