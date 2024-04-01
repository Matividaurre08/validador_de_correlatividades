import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private List<Materia> materiasAprobadas;

    public Alumno(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean tieneAprobada(Materia unaMateria) {
        return this.materiasAprobadas.contains(unaMateria);
    }

}