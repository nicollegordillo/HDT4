import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//
//
//  @ Project : HDT4
//  @ File Name : lectura.java
//  @ Date : 21/02/2023
//  @ Author : Nicolle Gordillo  
//
//
public class lectura {
    private ArrayList<String> ecuaciones= new ArrayList<>();
    
    /** 
     * @return ArrayList<String>
     * @throws IOException
     * Lee la(s) expresión(es) en infix y las devuelve en un arraylist
     */
    public ArrayList<String> lectura() throws IOException{
        BufferedReader reader;
        String line;
        int noOfLines=0;
        reader = new BufferedReader(new FileReader("datos.txt"));
        while (reader.readLine() != null) {
            noOfLines++;
        }
        reader = new BufferedReader(new FileReader("datos.txt"));
        for(int l=0; l<noOfLines;l++){
            line = reader.readLine();
            ecuaciones.add(line);
        }
        return ecuaciones;
    }
    
}
