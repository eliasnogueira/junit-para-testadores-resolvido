package exercicio4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreEPosCondicoesDeTeste {
	
	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void exibicaoPrePosCondicao_Teste1() {
		System.out.println("Executou o Teste 1");
	}

	@Test
	public void exibicaoPrePosCondicao_Teste2() {
		System.out.println("Executou o Teste 2");
	}
	
	@After
	public void posCondicao() {
		System.out.println("Executou a pos condicao");
	}
}


