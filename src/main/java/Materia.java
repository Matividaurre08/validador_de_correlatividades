import java.util.List;

public class Materia {
    private List<Materia> materiasCorrelativas;

    public Materia(List<Materia> materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }

    public boolean cumpleCorrelativas(Alumno unAlumno) {
        return this.materiasCorrelativas.stream().allMatch(materia->unAlumno.tieneAprobada(materia));
    }
}
