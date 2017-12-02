package exercicio1;

import org.junit.Test;

public class MeuPrimeiroTeste {

	/*
	 * Este é um método de teste porque contém o @Test 
	 * e é um método público e sem retorno (public void)
	 */
	@Test
	public void teste1() {
		System.out.println("Teste1 executado.");
	}

	/*
	 * Este é um método de teste porque contém o @Test 
	 * e é um método público e sem retorno (public void)
	 */
	@Test
	public void teste2() {
		System.out.println("Teste2 executado.");
	}
	
	/*
	 * Este não é um método de teste porque não tem o @Test
	 * portanto não executa e não é exibido na aba JUnit
	 * quando a classe é executada
	 */
	public void naoEUmTeste() {
		System.out.println("Esta mensagem não deve aparecer!");
	}
	
}
