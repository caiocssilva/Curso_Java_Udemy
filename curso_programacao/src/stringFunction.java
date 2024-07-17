
public class stringFunction {

	public static void main(String[] args) {

		String original = "abcde FGHIJ abc DEFG    ";
		
		String s01 = original.toLowerCase();     // Transforma para minusculo 
		String s02 = original.toUpperCase();	 // Transforma para maiusculo
		String s03 = original.trim();			 // Remove espaços
		String s04 = original.substring(2);		 // Recorta String
		String s05 = original.substring(2, 9);	 // Recorta String, começo e fim
		String s06 = original.replace('a', 'x'); // Substituir caracteres
		String s07 = original.replace("abc", "xy"); // Substituir Strings
		int i = original.indexOf("bc");				// Busca posição de alguma parte de String
		int j = original.lastIndexOf("bc"); 
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'b'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last Index of 'bc': " + j);
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");  // Recorta String com base em separador
		
		System.out.println(vect[0]);	
		System.out.println(vect[1]);	
		System.out.println(vect[2]);	

	}

}
