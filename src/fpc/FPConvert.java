/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpc;
import fpc.file.FileManager;

import java.nio.file.Path;
import javax.swing.JOptionPane;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author Christian Coughlin
 */
public class FPConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int jobCode;
        boolean check = false;
        String input = null;
        Path file;
        
        // Fix if canceled or quit
        while(!check){
            try{
                jobCode = Integer.parseInt(JOptionPane.showInputDialog(input, "Enter Job Number:"));
                check = true;
            }
            catch(NumberFormatException e){
                System.out.println("Invaild input, Enter a number");
            }
            catch(Exception e){
                System.out.print(e.toString());
            }
            
        }
        
        FileManager fileManager = new FileManager();
        
        file = dirSearch(jobCode);
        Files.copy(source, target, REPLACE_EXISTING);
        flowFix(file);
        //Close stream?
    }
    
}
