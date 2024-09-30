import org.json.JSONArray;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Ficheros {
    String ruta = "src/main/resources/alumnos.json";
    JSONArray datos = new JSONArray();
    FileWriter fw;


    public boolean agregarAlumno(AlumnosTel alumno){
        JSONObject alumnoDatos = new JSONObject();
        alumnoDatos.put("idAlumno", alumno.getIdAlumno());
        alumnoDatos.put("nombre", alumno.getNombre());
        alumnoDatos.put("edad", alumno.getEdad());
        alumnoDatos.put("repetidor", alumno.isRepetidor());
        alumnoDatos.put("telefono", alumno.getTelefono());
        datos.put(alumnoDatos);
        return true;
    }

    public boolean agregarAlumnos(AlumnosTel[] alumnos){
        for (AlumnosTel alumno : alumnos) {
            JSONObject alumnoDatos = new JSONObject();
            alumnoDatos.put("idAlumno", alumno.getIdAlumno());
            alumnoDatos.put("nombre", alumno.getNombre());
            alumnoDatos.put("edad", alumno.getEdad());
            alumnoDatos.put("repetidor", alumno.isRepetidor());
            alumnoDatos.put("telefono", alumno.getTelefono());
            datos.put(alumnoDatos);
        }

        return true;
    }
    public boolean agregarAlumnos(ArrayList<AlumnosTel> alumnos){
        JSONObject alumnoDatos = new JSONObject();
        for (AlumnosTel alumno : alumnos) {
            alumnoDatos.put("idAlumno", alumno.getIdAlumno());
            alumnoDatos.put("nombre", alumno.getNombre());
            alumnoDatos.put("edad", alumno.getEdad());
            alumnoDatos.put("repetidor", alumno.isRepetidor());
            alumnoDatos.put("telefono", alumno.getTelefono());
            datos.put(alumnoDatos);
        }
        return true;
    }

    public boolean guardarFichero(){
        try {
            fw = new FileWriter(ruta);
            fw.write(datos.toString(4));
            fw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
