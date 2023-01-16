import javax.swing.JOptionPane;

public class Exer17 {

	public static void main(String[] args) {
		String idade = JOptionPane.showInputDialog("Digite sua idade: ");
		int v1 = Integer.parseInt(idade);
		String result = "";
		if (v1 >= 18) {
			
			result = "Você é maior de idade. já pode tirar a carteira de motorista." ;
			
		} else { 
			result = "Você não é maior de idade." ;
		}

		JOptionPane.showMessageDialog(null, result);
		System.exit(0);
	}

}
