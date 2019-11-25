package view;

public class Operadores {

	public static void main(String[] args) {
		
		int x = 5;
		
		x ++ ; //x += 1; ahora ya usamos el que no esta dentro de comentario para incrementar en 1
		x -- ; //x -= 1; ahora ya usamos el que no esta dentro de comentario para decrementar en 1

		System.out.println("X es:" +x);
		
		int y = 5;
		int z;
		
		//z = y++;   ... esto es para asignar el valor de y a z y luego y aumenta su valor en 1+
		z = ++y;     // ... esto es para que ye tenga 1+ de valor y se le aumente el valor de y 
		
		
		
		System.out.println(z);
		
		

		
		
	}

}
