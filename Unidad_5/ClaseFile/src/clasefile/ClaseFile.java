/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasefile;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author LugoUAdeC
 */
public class ClaseFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File archivo = new File("documento.txt");

        try {
            if (!archivo.exists()) {
                if (archivo.createNewFile()) {
                    System.out.println("Archivo creado exitosamente.");
                }
            }

            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
            System.out.println("Tamaño (bytes): " + archivo.length());
            System.out.println("¿Es legible?: " + archivo.canRead());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
