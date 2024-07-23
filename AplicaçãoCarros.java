package Metodos;

public class AplicacaoCarros {

	public static void main(String[] args) {
		Carros c1 = new Carros();
		//Carros c2 = new Carros("Azul");
		//Carros c3 = new Carros("Branco","Polo");
		//Carros c4 = new Carros("Cinza","Civic",112.000);
		
		c1.cor="Preto";
		c1.modelo="Fusca";
		c1.valor=78000;
		System.out.printf("Modelo: %S \nCor: %S \nValor: %.2f",c1.modelo,c1.cor,c1.valor);
		System.out.println();
		//System.out.println(c2.cor);
		//System.out.println(c3.cor+" "+c3.modelo);
		//System.out.println(c4.cor+" "+c4.modelo+" "+c4.valor);
		
		c1.status();
		c1.ligar();
		c1.status();
		c1.ligar();
		c1.desligar();
		c1.status();
		c1.desligar();
		
		
		
		
		

	}

}
