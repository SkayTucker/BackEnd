import javax.swing.JOptionPane;

public class Exer18 {

	public static void main(String[] args) {
		//recebendo valores da camada de interface
		String v1 = JOptionPane.showInputDialog("Digite o primeiro valor. ");
		String v2 = JOptionPane.showInputDialog("Digite o segundo valor. ");
		//conversão de valores
		int vl1 = Integer.parseInt(v1);
		int vl2 = Integer.parseInt(v2);
		// logica 
		String result = ""; //variavel a ser atribuida dentro do escopo
		if (vl1 > vl2) {
			result += v1; // result = result + v1
		} else {
			if (vl2 > vl1) {
				result += vl2; // result = result + v2
				
			} else {

				result = "Iguais "+ vl1; // imprime se os números forem iguais
			}

		}
		JOptionPane.showMessageDialog(null, result);
		System.exit(0);

	}


}
