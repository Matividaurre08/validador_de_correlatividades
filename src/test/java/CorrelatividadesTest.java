import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class CorrelatividadesTest {

    private Materia discreta;
    private Materia algoritmos;
    private Materia paradigmas;
    private Materia sintaxis;
    private Materia diseño;

    @Before
    public void setUp() {
        discreta = new Materia (Arrays.asList());
        algoritmos = new Materia (Arrays.asList());
        paradigmas = new Materia (Arrays.asList(discreta,algoritmos));
        sintaxis = new Materia (Arrays.asList(discreta,algoritmos));
        diseño = new Materia (Arrays.asList(paradigmas,sintaxis));
    }

    @Test
    public void correlativasParadigmasAprobadas(){
        Alumno matias = new Alumno (Arrays.asList(discreta,algoritmos));
        Inscripcion inscripcion = new Inscripcion (Arrays.asList(paradigmas));
        Assert.assertTrue(inscripcion.aprobada(matias));
    }

    @Test
    public void correlativasParadigmasNoAprobadas(){
        Alumno matias = new Alumno (Arrays.asList(discreta));
        Inscripcion inscripcion = new Inscripcion (Arrays.asList(paradigmas));
        Assert.assertFalse(inscripcion.aprobada(matias));
    }

    @Test
    public void correlativasDiseñoAprobadas(){
        Alumno matias = new Alumno (Arrays.asList(discreta,algoritmos,paradigmas,sintaxis));
        Inscripcion inscripcion = new Inscripcion (Arrays.asList(diseño));
        Assert.assertTrue(inscripcion.aprobada(matias));
    }

    @Test
    public void correlativasDiseñoNoAprobadas(){
        Alumno matias = new Alumno (Arrays.asList(discreta,algoritmos,paradigmas));
        Inscripcion inscripcion = new Inscripcion (Arrays.asList(diseño));
        Assert.assertFalse(inscripcion.aprobada(matias));
    }

}