public class Main {
    public static void main(String[] args) {
        // Creación de objetos AlumnosTel con los datos de los alumnos
        AlumnosTel a1 = new AlumnosTel(1000L, "José Andrés Pérez", 22, false,
                new String[]{"222333444", "555666777","888999000"});
        AlumnosTel a2 = new AlumnosTel(1001L, "Ana Sanchis", 21, true,
                new String[]{"555666777", "888999000","333421039"});
        AlumnosTel a3 = new AlumnosTel(1002L, "Aina Gomes Pons", 23, true,
                new String[]{});
        AlumnosTel a4 = new AlumnosTel(1003L, "Ainara Gabaldón Estruch", 24, false,
                new String[]{"222111214","515626677"});

        // Creación de un array de AlumnosTel con los alumnos creados
        AlumnosTel[] alumnos = {a1, a2, a3, a4};

        // Creación de un objeto Ficheros para manejar los datos de los alumnos
        Ficheros f = new Ficheros();

        // Agregamos los alumnos al objeto Ficheros
        f.agregarAlumnos(alumnos);

        // Intentamos guardar los datos de los alumnos en un fichero
        // Si la operación es exitosa, se imprime un mensaje de éxito
        // Si la operación falla, se imprime un mensaje de error
        if (f.guardarFichero()){
            System.out.println("Fichero guardado correctamente");
        } else {
            System.out.println("Error al guardar el fichero");
        }
    }
}
