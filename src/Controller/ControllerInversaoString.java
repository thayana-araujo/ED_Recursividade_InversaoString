package Controller;

public class ControllerInversaoString {
	
	public ControllerInversaoString() {
		super();
	}
	
	public String invertString(String dados, int index) {
		
		//condição de parada
		//se os dados de entrada nenhum caracter, então o retorno vazio //
		
		if (index == 0){
			return "";
		}
		/* Se os dados de entrada forem mais de um caracter, então esses dados serão transformados e
		   e exibido invertido. Exemplo: Entrada: Amor, Resultado: Roma.*/
		else {
			return dados.substring(index-1, index)+invertString(dados, index - 1);
		}
		
	}

}
    