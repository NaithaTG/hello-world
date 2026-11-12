public class Ex1L1 {

	public static void main(String[] args) {
		// Faça um algoritmo que atribua valores a um vetor de 100 posições de acordo com o quadrado do seu índice.
				
		int numero [] = new int [100];
		
		for(int i = 0; i<numero.length; i++) {
			numero[i]=i*i;					
		}
		
		for(int i = 0; i<numero.length; i++) {
			System.out.println(numero[i]);
		}
			
	}
}
