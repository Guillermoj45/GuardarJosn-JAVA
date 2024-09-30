import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
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
}
