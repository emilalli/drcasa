import org.junit.Test
import org.junit.Assert
import org.junit.Before 

public class EnfermedadTest {

	@Before
	public void inicializarFixture(){
		enfermedad= new Infecciosa();
		fede = new Persona();
		fede.setCelulas(1000);
				
	}
	@Test
	public void enfermedadInfecciosaEsAgresiva()
	//Precondiciones
	Infecciosa enfermedad = new Infecciosa();
	enfermedad.setCelulasAmenazadas(150);
	
	
	
	//ejecucion
	boolean esAgresiva = enfermedad.esAgresiva(fede);
	
	//Validacion
	Assert.assertTrue(esAgresiva);
}
