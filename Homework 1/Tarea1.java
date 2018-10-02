import java.util.*;

class Main {
	
	//METODO ROT13
	public static String rot13(String string) {
		
		//convierte el input en un array de carácteres 'c':
		char[] c = string.toCharArray();
			
		//se crea un array 'r' vacio con el mismo tamaño de 'c':
		char[] r = new char[c.length];
		
		//revisa letra por letra el array 'c', transforma a rot13 y guarda en 'r':
		for (int i=0; i<c.length; i++) {	
			switch (c[i]) {
				case 'a':  r[i] = 'n';  break;
				case 'b':  r[i] = 'o';  break;
				case 'c':  r[i] = 'p';  break;
				case 'd':  r[i] = 'q';  break;
				case 'e':  r[i] = 'r';  break;
				case 'f':  r[i] = 's';  break;
				case 'g':  r[i] = 't';  break;
				case 'h':  r[i] = 'u';  break;
				case 'i':  r[i] = 'v';  break;
				case 'j':  r[i] = 'w';  break;
				case 'k':  r[i] = 'x';  break;
				case 'l':  r[i] = 'y';  break;
				case 'm':  r[i] = 'z';  break;

				case 'n':  r[i] = 'a';  break;
				case 'o':  r[i] = 'b';  break;
				case 'p':  r[i] = 'c';  break;
				case 'q':  r[i] = 'd';  break;
				case 'r':  r[i] = 'e';  break;
				case 's':  r[i] = 'f';  break;
				case 't':  r[i] = 'g';  break;
				case 'u':  r[i] = 'h';  break;
				case 'v':  r[i] = 'i';  break;
				case 'w':  r[i] = 'j';  break;
				case 'x':  r[i] = 'k';  break;
				case 'y':  r[i] = 'l';  break;
				case 'z':  r[i] = 'm';  break;

				default: r[i] = c[i];
			}
		}
		
		//convierte el char array 'r' en un string
		String out = new String(r);	
		return out;
	}
	
	//METODO MAIN (SIMILAR AL TEMPLATE DE LA TAREA)
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(rot13(line));
		}
	}

}
