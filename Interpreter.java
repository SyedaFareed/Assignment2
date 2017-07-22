/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Syeda Fareed
 */
public class Interpreter {
    
    private static String myfile;
    
    Interpreter(String a){  //parametrized constructor
    myfile=a + "\n";
    }
    
    public void concat(String mystring){   
        myfile = myfile + mystring + "\n"; //concatenating the next line to myfile string
    }
    
    public void prints(){
    
    System.out.println(myfile);

}   //end function prints
    
    public void interpret(String s){
        
        //if reach \n or ;, execute
        
    
    }   //end function interpret
    
    
}
