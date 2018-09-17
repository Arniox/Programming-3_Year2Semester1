/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextThingReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bjy5305
 */
public class TextThingReader {
    public static void main(String[] args)
    {
        BufferedReader br = null;
        PrintWriter pr = null;
        try {
            br = new BufferedReader(new FileReader("input.txt"));
            pr = new PrintWriter(new FileWriter("NewOutput.txt"));
            String line;
            while((line = br.readLine())!=null)
            {
                for(int i=line.length()-1;i>=0;--i)
                {
                    char currentChar=line.charAt(i);
                    if(Character.isLetter(currentChar))
                    {
                        pr.print(Character.toUpperCase(currentChar));
                    }
                }
                pr.println();
            }
        br.close();
        pr.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(TextThingReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TextThingReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
