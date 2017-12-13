package votacao;

import java.util.Calendar;

public class Votacao {

	/*
	 * Retorna um texto informando se a pessoa pode ou não votar
	 * dado um nome e a data de nascimento
	 */
	public static String podeVotar(String nome, int anoDeNascimento) {
		String retorno = null;
		int idade = retornaAnoAtual() - anoDeNascimento;
		
		if (idade < 16) {
			retorno = nome + " você não pode votar";
			
		} else if (idade >= 16 && idade <= 17 || idade > 70) {
			retorno = nome + " seu voto é facultativo";
			
		} else if (idade >= 18 && idade <= 70) {
			retorno = nome + " seu voto é obrigatório";
		}
		
		return retorno;
	}
	
	
	/*
	 * Retorna o ano atual (do seu computador)
	 */
	private static int retornaAnoAtual() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}
}
