package principal;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Alumnos {

    private int matricula;
    private String nombre;
    private String cadena;
    private int [] notas= new int[4];
    private double notaMedia;

    private static List<Alumnos> listaAlumnos = new ArrayList<>();

    public Alumnos(int matricula, String nombre, String cadena, int[] notas) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.cadena = cadena;
        this.notas = notas;
        this.notaMedia = notaMediaAlumno(notas) ;
    }

    public static double notaMediaAlumno(int [] arrayNotas){
        double media=0;

        for(int i =0; i<arrayNotas.length; i++){

            media+=arrayNotas[i];
        }

     return media/4;

    }

    public static void generarAlumnos(){

        listaAlumnos.add(new Alumnos(1111, "David", "Perea", new int[]{4,5,9,7}));
        listaAlumnos.add(new Alumnos(1112, "Angel", "Navarro", new int[]{8,4,2,7}));
        listaAlumnos.add(new Alumnos(1113, "Rubén", "Lindes", new int[]{7,8,10,6}));
        listaAlumnos.add(new Alumnos(1114, "Javier", "Sequera", new int[]{4,7,4,1}));
        listaAlumnos.add(new Alumnos(1115, "Alejandro", "Mulero", new int[]{10,6,9,9}));
        listaAlumnos.add(new Alumnos(1116, "Alejandro", "Sosa", new int[]{7,5,9,9}));

    }

    public static void crearFichero(){

        File fichero = new File("CajaFichero", "Alumnos.dat");

        try {
            if(fichero.createNewFile()){
                System.out.println("Se creó con éxito");
            }
        }catch (IOException e){

        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public static List<Alumnos> getListaAlumnos() {
        return listaAlumnos;
    }

    public static void setListaAlumnos(List<Alumnos> listaAlumnos) {
        Alumnos.listaAlumnos = listaAlumnos;
    }
}
