
public class Exer34Arrays {

	public static void main(String[] args) {
		int[] colecao = new int[5];
		System.out.println(colecao.length);
		
		for (int i = 0; i < colecao.length; i++) {
			colecao[i] = i;  // atribuição de valores
		}
		
		
		for (int i = 0; i < colecao.length; i++) {
			System.out.println(colecao[i]); // impressão de cada um dos valores
		}

	}

}
