package unidad.tda;

public class Estudiante implements Cloneable {
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
        return "unidad.tda.Estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Grado='" + Grado + '\'' +
                ", NControl='" + NControl + '\'' +
                '}';
    }

    @Override
    public Estudiante clone() {
        Estudiante clone = new Estudiante(this.Nombre,this.Grado,this.NControl);
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return clone;
    }
}
