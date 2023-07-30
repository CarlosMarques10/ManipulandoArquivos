package applications;

import java.io.File;
import java.util.Scanner;

public class AppFile {
    public static void main(String[] args) {
        
        
        //----------LEITURA DE ARQUIVOS COM FILE----------//

        String path = ""; //Caminho do arquivo
        
        File file = new File(path);
        Scanner scan = null;

        try {
            scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            if(scan != null){
                scan.close();
            }
        }



        //----------MANIPULANDO PASTAS COM FILE----------//
        
        //MOSTRANDO PASTAS
        File[] folders = file.listFiles(File::isDirectory);
        System.out.println("Pastas: ");

        for(File folder : folders){
            System.out.println(folder);
        }


        //MOSTRANDO ARQUIVOS
        File[] files = file.listFiles(File::isFile);
        System.out.println("Arquivos: ");

        for(File f : files){
            System.out.println(f);
        }


        //CRIANDO UMA PASTA
        boolean resp = new File(path + "\\nomeDaPasta").mkdir();
        System.out.println("Diretorio criado? " + resp);

        
        //CAPTURAR NOME DO ARQUIVO, CAMINHO E CAMINHO COMPLETO
        file.getName();
        file.getParent();
        file.getPath();

    }
}
