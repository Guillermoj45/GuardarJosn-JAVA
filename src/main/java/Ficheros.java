import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Ficheros {
    String ruta = "src/main/resources/alumnos.json";
    JSONObject datos = new JSONObject();
    FileWriter fw;


    public boolean agregarAlumno(AlumnosTel alumno){
        datos.put("idAlumno", alumno.getIdAlumno());
        datos.put("nombre", alumno.getNombre());
        datos.put("edad", alumno.getEdad());
        datos.put("repetidor", alumno.isRepetidor());
        datos.put("telefono", alumno.getTelefono());
        return true;
    }

    public boolean agregarAlumnos(AlumnosTel[] alumnos){
        for (AlumnosTel alumno : alumnos) {
            datos.put("idAlumno", alumno.getIdAlumno());
            datos.put("nombre", alumno.getNombre());
            datos.put("edad", alumno.getEdad());
            datos.put("repetidor", alumno.isRepetidor());
            datos.put("telefono", alumno.getTelefono());
        }
        return true;
    }
    public boolean agregarAlumnos(ArrayList<AlumnosTel> alumnos){
        for (AlumnosTel alumno : alumnos) {
            datos.put("idAlumno", alumno.getIdAlumno());
            datos.put("nombre", alumno.getNombre());
            datos.put("edad", alumno.getEdad());
            datos.put("repetidor", alumno.isRepetidor());
            datos.put("telefono", alumno.getTelefono());
        }
        return true;
    }
}
