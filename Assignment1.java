/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Syeda Fareed
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     * 
     */
    
    private static final String path = "C:\\Users\\uneez\\OneDrive\\Documents\\NetBeansProjects\\Assignment1\\File.txt";
    
    public static void main(String[] args) {
        // TODO code application logic here
   	BufferedReader mybuffer = null;
	FileReader myflreader = null; //need to include exception handling 
        //as java gives error otherwise.
                
        try{
                myflreader= new FileReader(path);
                mybuffer=new BufferedReader(myflreader);    //reading the file into a buffer
                //String line=null;
                
                String line=mybuffer.readLine();
                Interpreter myint=new Interpreter(line);    //intializing Interpreter's private string with the first line of File
            
                while((line=mybuffer.readLine())!=null){    //reading the buffer into a string until we reach end    
                    myint.concat(line); //concatenating next line to private string of Interpreter
                    myint.prints();
                
                }      
                
        }
        
        catch(IOException i)
        {
           System.out.println(i);
        
        }
        
        
    }   //end main

		

}   //end Assignment 1
    
  
