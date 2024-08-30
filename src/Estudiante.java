public class Estudiante {
    private String Nombre;
    private String Grado;
    private String NControl;
    public Estudiante(String nombre, String grado, String NControl) {
        Nombre = nombre;
        Grado = grado;
        this.NControl = NControl;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }

    public String getNControl() {
        return NControl;
    }

    public void setNControl(String NControl) {
        this.NControl = NControl;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Grado='" + Grado + '\'' +
                ", NControl='" + NControl + '\'' +
                '}';
    }
}
