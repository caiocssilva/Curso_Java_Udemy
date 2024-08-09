import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list {

	public static void main(String[] args) {

		// Cria uma nova ArrayList de Strings
		List<String> list = new ArrayList<>();
		
		// Adiciona elementos à lista
		list.add("Caio");    // Adiciona "Caio" ao final da lista
		list.add("Mara");    // Adiciona "Mara" ao final da lista
		list.add("Miguel");  // Adiciona "Miguel" ao final da lista
		list.add("Rebeka");  // Adiciona "Rebeka" ao final da lista
		list.add(2, "Junior");  // Adiciona "Junior" na posição 2 da lista (índice 0 baseado)

		// Imprime o tamanho atual da lista
		System.out.println(list.size());
				
		// Itera sobre a lista e imprime cada elemento
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");

		// Remove todos os elementos cuja primeira letra é 'M' usando um predicado
		list.removeIf(x -> x.charAt(0) == 'M');  // Remove elementos onde a primeira letra é 'M'

		// Itera sobre a lista atualizada e imprime cada elemento
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------");

		// Imprime o índice do elemento "Rebeka" na lista (ou -1 se não encontrado)
		System.out.println("Index of Rebeka: " + list.indexOf("Rebeka"));
		System.out.println("-----------------");

		// Cria uma nova lista contendo apenas os elementos cuja primeira letra é 'R'
		List<String> result = list.stream()
			.filter(x -> x.charAt(0) == 'R')  // Filtra elementos onde a primeira letra é 'R'
			.collect(Collectors.toList());    // Coleta o resultado em uma nova lista
		
		// Itera sobre a nova lista resultante e imprime cada elemento
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("-----------------");

		// Encontra o primeiro elemento cuja primeira letra é 'R' e imprime, ou imprime null se não encontrado
		String name = list.stream()
			.filter(x -> x.charAt(0) == 'R')  // Filtra elementos onde a primeira letra é 'R'
			.findFirst()                      // Encontra o primeiro elemento do stream
			.orElse(null);                    // Retorna o elemento encontrado ou null se não houver nenhum
		
		System.out.println(name);
	}
}
