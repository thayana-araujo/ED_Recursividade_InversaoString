package view;

import javax.swing.JOptionPane;

import Controller.ControllerInversaoString;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
			//declara��o das vari�veis que receber� os dados e mostrar� o resultado
			String dados, resultado;
			
			//vari�vel que ir� receber a cadeia de caracteres
			dados = JOptionPane.showInputDialog("Informe os caracteres para fazer a invers�o");
			
			//m�todo construtor
			ControllerInversaoString inverterString = new ControllerInversaoString();
			
			//vari�vel que ir� receber e fazer a invers�o
			resultado = inverterString.invertString(dados, dados.length());
			
			//exibi��o do resultado no console
			System.out.println("Invers�o dos dados digitados : "+resultado+".");

		

	}

}
