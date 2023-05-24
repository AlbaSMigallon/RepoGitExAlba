import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {
		ArrayList<Integer> edades = new ArrayList<Integer>();
		edades.add(12);
		edades.add(18);
		edades.add(5);
		edades.add(66);
		edades.add(29);
		edades.add(8);
		edades.add(20);
		edades.add(65);

		SegundaClase edades1 = new SegundaClase(edades);

		int menores = 0;
		int mayores = 0;
		int jubilados = 0;
		for (int i = 0; i < edades.size(); i++) {
			if (edades.get(i) < 18) {
				menores++;
			} else if (edades.get(i) >= 65) {
				jubilados++;
			} else {
				mayores++;
			}
		}

		System.out
				.println("Menores de edad: " + menores + ", Mayores de edad: " + mayores + ", Jubilados:" + jubilados);

	}

}
