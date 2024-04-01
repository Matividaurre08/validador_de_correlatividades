import java.util.List;

public class Inscripcion {
    private List<Materia> materiasAInscribir;

    public Inscripcion(List<Materia> materiasAInscribir) {
        this.materiasAInscribir = materiasAInscribir;
    }

    public boolean aprobada(Alumno unAlumno) {
        return this.materiasAInscribir.stream().allMatch(materia -> materia.cumpleCorrelativas(unAlumno));
    }
}
