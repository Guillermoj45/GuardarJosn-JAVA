public class AlumnosTel {
    // Variables privadas para almacenar los datos del alumno
    private Long idAlumno;
    private String nombre;
    private int edad;
    private boolean repetidor;
    private String[] telefono;

    // Constructor de la clase AlumnosTel
    public AlumnosTel(Long idAlumno, String nombre, int edad, boolean repetidor, String[] telefono) {
        // Inicialización de las variables con los valores proporcionados
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.repetidor = repetidor;
        this.telefono = telefono;
    }

    // Método getter para obtener el ID del alumno
    public Long getIdAlumno() {
        return idAlumno;
    }

    // Método setter para establecer el ID del alumno
    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    // Método getter para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Método setter para establecer el nombre del alumno
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método getter para obtener la edad del alumno
    public int getEdad() {
        return edad;
    }

    // Método setter para establecer la edad del alumno
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método getter para verificar si el alumno es repetidor
    public boolean isRepetidor() {
        return repetidor;
    }

    // Método setter para establecer si el alumno es repetidor
    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    // Método getter para obtener los números de teléfono del alumno
    public String[] getTelefono() {
        return telefono;
    }

    // Método setter para establecer los números de teléfono del alumno
    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }
}
