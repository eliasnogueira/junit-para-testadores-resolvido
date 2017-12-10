package exercicio6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercicio1.MeuPrimeiroTeste;
import exercicio2.ValidacaoVerdadeiroFalso;
import exercicio3.ValidacaoIgualdade;
import exercicio4.PreEPosCondicoesDeTeste;
import exercicio5.PreEPosCondicoesDaClasse;

@RunWith(Suite.class)
@SuiteClasses({
	MeuPrimeiroTeste.class,
	ValidacaoVerdadeiroFalso.class,
	ValidacaoIgualdade.class,
	PreEPosCondicoesDeTeste.class,
	PreEPosCondicoesDaClasse.class
})
public class SuiteDeTeste {

}
