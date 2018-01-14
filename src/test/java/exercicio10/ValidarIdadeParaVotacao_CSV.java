package exercicio10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import votacao.Votacao;

@RunWith(JUnitParamsRunner.class)
public class ValidarIdadeParaVotacao_CSV {
	
	@Test
	@FileParameters(value = "src/test/resources/massa_de_dados.csv", mapper = CsvWithHeaderMapper.class)
	public void validaObrigatoriedadeVoto(String nome, int anoDeNascimento, String resultado) {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}
	
}
