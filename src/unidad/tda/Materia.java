package unidad.tda;

public class Materia {
    String Nombre;
    String Cve;
    String Profesor;

    public Materia(String nombre, String cve, String profesor) {
        Nombre = nombre;
        Cve = cve;
        Profesor = profesor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCve() {
        return Cve;
    }

    public void setCve(String cve) {
        Cve = cve;
    }

    public String getProfesor() {
        return Profesor;
    }

    public void setProfesor(String profesor) {
        Profesor = profesor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "Nombre='" + Nombre + '\'' +
                ", Cve='" + Cve + '\'' +
                ", Profesor='" + Profesor + '\'' +
                '}';
    }
}
