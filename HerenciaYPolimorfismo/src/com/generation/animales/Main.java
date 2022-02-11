package com.generation.animales;

public class Main {

	public static void main(String[] args) {
		//en java no se puede heredar de mas de una clase padre, pero se pueden implementar varias interfaces
		
		Perro lomito1 = new Perro();
		lomito1.comer();
		
		
		Vaca vaca1 = new Vaca();
		vaca1.dormir();
		
		
		Gato michi = new Gato();
		michi.dormir();
		

	}

}
