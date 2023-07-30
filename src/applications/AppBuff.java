package applications;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppBuff {
    public static void main(String[] args) {
        

        //----------LENDO ARQUIVOS COM BUFFEREDREADER----------//

        String path = ""; //Caminho do arquivo
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        //----------CRIANDO ARQUIVOS COM BUFFEREDREADER----------//

        String[] lines = new String[]{"Palavra1","Palavra2","Palavra3"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String l : lines){
                bw.write(l);
                bw.newLine();
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
