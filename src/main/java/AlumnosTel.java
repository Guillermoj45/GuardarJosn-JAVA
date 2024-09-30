public class AlumnosTel {
    private Long idAlumno;
    private String nombre;
    private int edad;
    private boolean repetidor;
    private String[] telefono;

    public AlumnosTel(Long idAlumno, String nombre, int edad, boolean repetidor, String[] telefono) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.repetidor = repetidor;
        this.telefono = telefono;
    }

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public String[] getTelefono() {
        return telefono;
    }

    public void setTelefono(String[] telefono) {
        this.telefono = telefono;
    }
}
