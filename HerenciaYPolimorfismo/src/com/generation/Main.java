package com.generation;

public class Main {

	public static void main(String[] args) {
		
		
	//herencia: cuando una clase hereda a otra, esta tiene acceso a sus atributos y metodos 
		
		
		
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(10);
		
		System.out.println("el area del " + cuadrado1.getNombre() + "es " + cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		
		System.out.println("el area del " + triangulo1.getNombre() + "es " + triangulo1.calcularArea());
    
		
	}

}
