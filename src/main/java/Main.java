public class Main {
    public static void main(String[] args) {
        AlumnosTel a1 = new AlumnosTel(1000L, "José Andrés Pérez", 22, false,
                new String[]{"222333444", "555666777","888999000"});
        AlumnosTel a2 = new AlumnosTel(1001L, "Ana Sanchis", 21, true,
                new String[]{"555666777", "888999000","333421039"});
        AlumnosTel a3 = new AlumnosTel(1002L, "Aina Gomes Pons", 23, true,
                new String[]{});
        AlumnosTel a4 = new AlumnosTel(1003L, "Ainara Gabaldón Estruch", 24, false,
                new String[]{"222111214","515626677"});

        AlumnosTel[] alumnos = {a1, a2, a3, a4};

    }
}
