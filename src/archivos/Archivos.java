
package archivos;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Archivos {

    
    public static void main(String[] args){ 
        try{
        Scanner in=new Scanner(new FileReader("Archivo.txt"));
        while(in.hasNext()){
            System.out.println(in.nextLine());
        }
        in.close();
            }catch(FileNotFoundException ex){
        System.out.println("No se encontro el archivo");
        
        }
      //Escribir en el arcchivo
   try {
       Files.write(
       Paths.get("archivo.txt"),
               "\r\nArturo Garcia Rodriguez".getBytes(),
               StandardOpenOption.APPEND);
   }catch (IOException e){
           
             
   }
    
    }
    
    
    
    
    
    }
    

