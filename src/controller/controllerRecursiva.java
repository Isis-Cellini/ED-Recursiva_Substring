package controller;

public class controllerRecursiva {

	public controllerRecursiva() {
		// TODO Auto-generated constructor stub
	}

	public String inverte(String palavra, int posFinal) {
		if (posFinal < 0) { //para na primeira posicao da substring
			return "";
		} else {
			String retorno = palavra.substring(posFinal, posFinal + 1); //Comeca verificando pela ultima posicao da substring e le a posicao+1 
			posFinal -= 1; //diminui 1 do valor da ultima posicao
			return retorno + inverte(palavra, posFinal);

		}
	}

}
