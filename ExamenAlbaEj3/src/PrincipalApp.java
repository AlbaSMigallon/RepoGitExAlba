import java.util.ArrayList;
/**
 * 
 * @author alumno
 *
 */
public class PrincipalApp {
/**
 * 
 * @param args crea arraylist crea objeto y luego compara las edadesd el arraylist
 */
	public static void main(String[] args) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		/**
		 * rellenar datos
		 */
		edades.add(12);
		edades.add(18);
		edades.add(5);
		edades.add(66);
		edades.add(29);
		edades.add(8);
		edades.add(20);
		edades.add(65);

		
		/**
		 * creacion objeto
		 */
		SegundaClase edades1 = new SegundaClase(edades);

		
		/**
		 * creacion de variables para contar coincidencias
		 */
		int menores = 0;
		int mayores = 0;
		int jubilados = 0;
		
		
		/**
		 * for para ir comparando
		 */
		for (int i = 0; i < edades.size(); i++) {
			if (edades.get(i) < 18) {
				menores++;
			} else if (edades.get(i) >= 65) {
				jubilados++;
			} else {
				mayores++;
			}
		}
		
		
		/**
		 * pintar el resultado
		 */

		System.out
				.println("Menores de edad: " + menores + ", Mayores de edad: " + mayores + ", Jubilados:" + jubilados);

	}

}
