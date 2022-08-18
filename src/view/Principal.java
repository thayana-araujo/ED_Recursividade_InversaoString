package view;

import javax.swing.JOptionPane;

import Controller.ControllerInversaoString;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
			//declaração das variáveis que receberá os dados e mostrará o resultado
			String dados, resultado;
			
			//variável que irá receber a cadeia de caracteres
			dados = JOptionPane.showInputDialog("Informe os caracteres para fazer a inversão");
			
			//método construtor
			ControllerInversaoString inverterString = new ControllerInversaoString();
			
			//variável que irá receber e fazer a inversão
			resultado = inverterString.invertString(dados, dados.length());
			
			//exibição do resultado no console
			System.out.println("Inversão dos dados digitados : "+resultado+".");

		

	}

}
