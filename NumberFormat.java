/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberformat;

import java.util.Scanner;
import java.io.*;
public class NumberFormat {
    
    public static void main(String[] args){
        double A=2,PI=3.15,radius=0;
        try{
            
        Scanner in = new Scanner(System.in);
            System.out.println("please enter radius ");
        String n = in.nextLine();
        radius=Double.parseDouble(n);
        }catch(NumberFormatException ex){
            System.err.println("Invalid");
        }
        A=radius/2*PI;
        
    try{ 
    File f = new File("Cirele_curcumferentce.text");
   PrintWriter output = new PrintWriter(f);
   output.println("the area is:\n "+A);
   output.close();
    }catch(IOException ex){
        System.err.println("can not open file");
    }

    }
}

