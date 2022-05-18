package principal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

import static principal.Alumnos.*;
import static principal.Alumnos.getListaAlumnos;


public class Main {

    public static void main(String[] args) {
	// write your code here
        crearFichero();
        generarAlumnos();

        StringBuffer sb = new StringBuffer();
        try{
            RandomAccessFile raf = new RandomAccessFile("CajaFichero/Alumnos.dat", "rw");

            for(Alumnos a : getListaAlumnos()){
               raf.writeChars(a.getNombre());
            }


            raf.seek(181);
            String nombre ="";
            for (int i=0; i<20;i++){
                nombre=nombre+raf.readChar();
            }

            System.out.println(nombre);
            System.out.println(nombre.length());






        }catch (FileNotFoundException e){

            System.out.println("El fichero no se encuentra");
        } catch (IOException e) {

            e.printStackTrace();
        }


    }
}
