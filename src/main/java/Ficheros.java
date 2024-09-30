import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Ficheros {
    // Ruta del archivo donde se guardarán los datos de los alumnos
    String ruta = "src/main/resources/alumnos.json";
    // JSONArray para almacenar los datos de los alumnos en formato JSON
    JSONArray datos = new JSONArray();
    // FileWriter para escribir los datos en el archivo
    FileWriter fw;

    // Método para agregar un alumno al JSONArray
    public boolean agregarAlumno(AlumnosTel alumno){
        // Creación de un JSONObject para almacenar los datos del alumno
        JSONObject alumnoDatos = new JSONObject();
        // Agregando los datos del alumno al JSONObject
        alumnoDatos.put("idAlumno", alumno.getIdAlumno());
        alumnoDatos.put("nombre", alumno.getNombre());
        alumnoDatos.put("edad", alumno.getEdad());
        alumnoDatos.put("repetidor", alumno.isRepetidor());
        alumnoDatos.put("telefono", alumno.getTelefono());
        // Agregando el JSONObject al JSONArray
        datos.put(alumnoDatos);
        return true;
    }

    // Método para agregar varios alumnos al JSONArray
    public boolean agregarAlumnos(AlumnosTel[] alumnos){
        // Recorriendo el array de alumnos
        for (AlumnosTel alumno : alumnos) {
            // Creación de un JSONObject para almacenar los datos del alumno
            JSONObject alumnoDatos = new JSONObject();
            // Agregando los datos del alumno al JSONObject
            alumnoDatos.put("idAlumno", alumno.getIdAlumno());
            alumnoDatos.put("nombre", alumno.getNombre());
            alumnoDatos.put("edad", alumno.getEdad());
            alumnoDatos.put("repetidor", alumno.isRepetidor());
            alumnoDatos.put("telefono", alumno.getTelefono());
            // Agregando el JSONObject al JSONArray
            datos.put(alumnoDatos);
        }
        return true;
    }

    // Método para agregar varios alumnos al JSONArray desde un ArrayList
    public boolean agregarAlumnos(ArrayList<AlumnosTel> alumnos){
        // Recorriendo el ArrayList de alumnos
        for (AlumnosTel alumno : alumnos) {
            // Creación de un JSONObject para almacenar los datos del alumno
            JSONObject alumnoDatos = new JSONObject();
            // Agregando los datos del alumno al JSONObject
            alumnoDatos.put("idAlumno", alumno.getIdAlumno());
            alumnoDatos.put("nombre", alumno.getNombre());
            alumnoDatos.put("edad", alumno.getEdad());
            alumnoDatos.put("repetidor", alumno.isRepetidor());
            alumnoDatos.put("telefono", alumno.getTelefono());
            // Agregando el JSONObject al JSONArray
            datos.put(alumnoDatos);
        }
        return true;
    }

    // Método para guardar el JSONArray en un archivo
    public boolean guardarFichero(){
        try {
            // Creando el FileWriter con la ruta del archivo
            fw = new FileWriter(ruta);
            // Escribiendo el JSONArray en el archivo con una indentación de 4 espacios
            fw.write(datos.toString(4));
            // Cerrando el FileWriter
            fw.close();
            return true;
        } catch (IOException e) {
            // Imprimiendo la traza de la excepción en caso de error
            e.printStackTrace();
            return false;
        }
    }

    public JSONArray leerFichero() {
        try {
            if (!new File(ruta).exists())
                throw new FileNotFoundException("El archivo no existe");
            if (!new File(ruta).isFile())
                throw new FileNotFoundException("La ruta es un directorio");
            // Creando un objeto FileReader con la ruta del archivo
            FileReader fr = new FileReader(ruta);
            // Creando un objeto BufferedReader para leer el archivo
            BufferedReader br = new BufferedReader(fr);
            // Creando un StringBuilder para almacenar el contenido del archivo
            StringBuilder sb = new StringBuilder();
            // Creando una variable para almacenar cada línea del archivo
            String linea;
            // Recorriendo el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                // Agregando la línea al StringBuilder
                sb.append(linea);
            }
            // Cerrando el BufferedReader
            br.close();
            // Creando un JSONArray a partir del contenido del StringBuilder
            return datos = new JSONArray(sb.toString());

        } catch (IOException e) {
            // Imprimiendo la traza de la excepción en caso de error
            e.printStackTrace();
        }
        return null;
    }
}
