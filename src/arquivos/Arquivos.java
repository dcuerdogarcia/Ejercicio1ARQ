/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Arquivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File directorio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        directorio.mkdirs();

        File arquivo = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/Products1.txt");
        if (arquivo.createNewFile()) {
            System.out.println("Está creada");
        }
        File directorio2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        directorio2.mkdirs();

        File arquivo2 = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/Products2.txt");
        if (arquivo2.createNewFile()) {
            System.out.println("Está creada");

        }

        File[] ficheros = directorio.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            System.out.println(ficheros[i].getName());

        }
        File miDir = new File(".");
        try {
            System.out.println("O directorio actual é: " + miDir.getCanonicalPath());

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(directorio.getName() + "\n" + directorio.getAbsolutePath() + "\n" + directorio.canRead() + "\n" + directorio.canWrite() + "\n" + directorio.length());

        directorio.setReadOnly();
        directorio.setWritable(true);

        directorio.delete();
    }

}
