import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


public class PilhaTest {

	private Pilha pilha;
	
	@Before
	public void setUp() {
		this.pilha = new Pilha();
	}
	
	@Test
	public void getTamanhoTest() {
		
		Assert.assertTrue(this.pilha.getTamanho() == 0);
		
		this.pilha.entrarNaPilha(1);
		this.pilha.entrarNaPilha(23);
		this.pilha.entrarNaPilha(2);
		this.pilha.entrarNaPilha(5);
		this.pilha.entrarNaPilha(45);
		this.pilha.entrarNaPilha(3);
		
		Assert.assertTrue(this.pilha.getTamanho() == 6);
		
		this.pilha.sairDaPilha();
		
		Assert.assertTrue(this.pilha.getTamanho() == 5);
	}
	
	@Test
	public void entrarNaPilhaTest() {
		this.pilha.entrarNaPilha(1);
		this.pilha.entrarNaPilha(23);
		this.pilha.entrarNaPilha(2);
		this.pilha.entrarNaPilha(5);
		this.pilha.entrarNaPilha(45);
		this.pilha.entrarNaPilha(3);
		
		Assert.assertTrue(this.pilha.sairDaPilha() == 3);
		Assert.assertTrue(this.pilha.sairDaPilha() == 45);
		Assert.assertTrue(this.pilha.sairDaPilha() == 5);
		Assert.assertTrue(this.pilha.sairDaPilha() == 2);
		Assert.assertTrue(this.pilha.sairDaPilha() == 23);
		Assert.assertTrue(this.pilha.sairDaPilha() == 1);
		
	}
	
	@Test
	public void sairDaPilhaTest() {
		this.pilha.entrarNaPilha(45);
		this.pilha.entrarNaPilha(3);
		
		Assert.assertTrue(this.pilha.sairDaPilha() == 3);
		Assert.assertTrue(this.pilha.sairDaPilha() == 45);	
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void sairDaPilhaExceptionTest() {
		this.pilha.entrarNaPilha(45);
		Assert.assertTrue(this.pilha.sairDaPilha() == 45);
		
		Assert.assertTrue(this.pilha.sairDaPilha() == 100); //retirar de uma pilha vazia		
	}
	
	@Test
	public void getTopoTest() {
		this.pilha.entrarNaPilha(23);
		this.pilha.entrarNaPilha(2);
		this.pilha.entrarNaPilha(5);
		this.pilha.entrarNaPilha(45);
		this.pilha.entrarNaPilha(3);

		Assert.assertTrue(this.pilha.getTopo() == 3);
		Assert.assertTrue(this.pilha.getTopo() == 3);

		this.pilha.entrarNaPilha(2);
		this.pilha.entrarNaPilha(5);
		
		Assert.assertTrue(this.pilha.getTopo() == 5);
		Assert.assertTrue(this.pilha.getTopo() == 5);
		
		this.pilha.sairDaPilha();
				
		Assert.assertTrue(this.pilha.getTopo() == 2);

		this.pilha.sairDaPilha();
		this.pilha.sairDaPilha();

		Assert.assertTrue(this.pilha.getTopo() == 45);

	}
	
}
