import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>(); 
		
		lista.add(10); // [0]
		lista.add(5); // [1]
		lista.add(8);
		lista.add(100);
		lista.add(15);
		lista.add(100);
		
//		lista.clear(); exclui todos os elementos da lista
		
		int t = lista.size(); //size = length = tamanho do vetor
		
		System.out.println(t);
		System.out.println(lista);
		lista.set(2, 16); //substitui o vetor na posicao 2 para 16
		System.out.println(lista);
		int x = lista.get(3);
		System.out.println(x);
		
		System.out.println();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i)); //para captura cada elemento da lista usa o get
		}
		
		System.out.println();
		
		for (Integer num : lista) { //por elemento da lista, é a mesma coisa do for, mas neste caso nao consegue capturar a posiçao do elemento
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println(lista.contains(10));//true
		System.out.println(lista.contains(20));//false
		System.out.println();
		lista.remove(2); //posicao [2]
		System.out.println(lista);
		lista.remove((Integer)5); //cast com o tipo da var e o valor que deseja remover
		System.out.println(lista);

	}

}
