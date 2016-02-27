package principal;

import java.util.Scanner;
import clases.Categoria;
import clases.Componente;
import clases.Ingrediente;
import clases.Plato;

public class Restaurante
{

	public static void main(String[] args)
	{
		// Ingredientes sushi
		Ingrediente arroz = new Ingrediente("Arroz", "Cereal");
		Ingrediente alga = new Ingrediente("Alga", "Vegetal");
		Ingrediente vinagre = new Ingrediente("vinagre", "Condimento");
		// ingredientes pizza
		Ingrediente salami = new Ingrediente("Salami", "Embutido");
		Ingrediente salsaTomate = new Ingrediente("Salsa de Tomate", "Salsa");
		Ingrediente masaPizza = new Ingrediente("Masa Pizza", "Masa");
		Ingrediente queso = new Ingrediente("Queso", "Lacteo");
		Ingrediente aceite = new Ingrediente("Aceite", "Condimento");
		// ingredientes arroz 3 delicias
		Ingrediente gambas = new Ingrediente("Gambas", "Marisco");
		Ingrediente guisantes = new Ingrediente("Guisantes", "Verdura");
		Ingrediente jamonCocido = new Ingrediente("Jamon Cocido", "Embutido");
		Ingrediente huevos = new Ingrediente("Huevos", "Origen Animal");
		// ingredientes Macarrones con salchichas
		Ingrediente macarrones = new Ingrediente("Macarrones", "Pasta");
		Ingrediente salchichas = new Ingrediente("Salchichas", "Embutido");
		// ingrediente perrito caliente
		Ingrediente panPerrito = new Ingrediente("Pan Perrito Caliente", "Acompañante");

		// componentes sushi
		Componente arrozC = new Componente(arroz, 100);
		Componente algaC = new Componente(alga, 20);
		Componente vinagreC = new Componente(vinagre, 5);
		// componente pizza
		Componente salamiC = new Componente(salami, 100);
		Componente salsaTomateC = new Componente(salsaTomate, 50);
		Componente masaPizzaC = new Componente(masaPizza, 50);
		Componente quesoC = new Componente(queso, 25);
		Componente aceiteC = new Componente(aceite, 20);
		// componentes Arroz 3 delicias
		Componente gambasC = new Componente(gambas, 100);
		Componente guisantesC = new Componente(guisantes, 50);
		Componente jamonCocidoC = new Componente(jamonCocido, 50);
		Componente huevosC = new Componente(huevos, 100);
		Componente arrozDeliciasC = new Componente(arroz, 100);
		Componente aceiteDeliciasC = new Componente(aceite, 25);
		// compoenntes Macarrones con tomate
		Componente macarronesC = new Componente(macarrones, 100);
		Componente salchichasC = new Componente(salchichas, 3);
		// componentes Perritos Calientes
		Componente panPerritoC = new Componente(panPerrito, 2);

		// receta sushi
		Componente[] recetaSushi = new Componente[3];
		recetaSushi[0] = arrozC;
		recetaSushi[1] = algaC;
		recetaSushi[2] = vinagreC;

		// receta pizza
		Componente[] recetaPizza = new Componente[5];
		recetaPizza[0] = salamiC;
		recetaPizza[1] = salsaTomateC;
		recetaPizza[2] = masaPizzaC;
		recetaPizza[3] = quesoC;
		recetaPizza[4] = aceiteC;
		// receta arroz 3 delicias
		Componente[] recetaArrozTresDelicias = new Componente[6];
		recetaArrozTresDelicias[0] = gambasC;
		recetaArrozTresDelicias[1] = guisantesC;
		recetaArrozTresDelicias[2] = jamonCocidoC;
		recetaArrozTresDelicias[3] = huevosC;
		recetaArrozTresDelicias[4] = arrozDeliciasC;
		recetaArrozTresDelicias[5] = aceiteDeliciasC;
		// receta macarrones
		Componente[] recetaMacarronesSalchichas = new Componente[5];
		recetaMacarronesSalchichas[0] = macarronesC;
		recetaMacarronesSalchichas[1] = salchichasC;
		recetaMacarronesSalchichas[2] = quesoC;
		recetaMacarronesSalchichas[3] = quesoC;
		recetaMacarronesSalchichas[4] = salsaTomateC;
		// receta Perritos Calientes
		Componente[] recetaPerritosCalientes = new Componente[2];
		recetaPerritosCalientes[0] = panPerritoC;
		recetaPerritosCalientes[1] = salchichasC;

		// platos chinos
		Plato[] chinos = new Plato[2];
		Plato sushi = new Plato("Sushi", "China", recetaSushi, 15, "Alta");
		sushi.setReceta(recetaSushi);// hacemos set del array con los
										// componentes
		Plato arrozTresDelicias = new Plato("Arroz Tres Delicias", "China", recetaArrozTresDelicias, 10, "Media");
		arrozTresDelicias.setReceta(recetaArrozTresDelicias);// hacemos set del
																// array con los
																// componentes
		chinos[0] = sushi;
		chinos[1] = arrozTresDelicias;
		// platos italianos
		Plato[] italianos = new Plato[2];
		Plato pizzaSalami = new Plato("Pizza de Salami", "Italiana", recetaPizza, 10, "Baja");
		pizzaSalami.setReceta(recetaPizza);
		Plato macarronesSalchichas = new Plato("Macarrones con Salchichas", "Italiana", recetaMacarronesSalchichas, 15,
				"Media");
		macarronesSalchichas.setReceta(recetaMacarronesSalchichas);
		italianos[0] = pizzaSalami;
		italianos[1] = macarronesSalchichas;
		// platos americanos
		Plato[] americanos = new Plato[1];
		Plato perritosCalientes = new Plato("Perritos Calientes", "Americana", recetaPerritosCalientes, 5, "Baja");
		perritosCalientes.setReceta(recetaPerritosCalientes);
		americanos[0] = perritosCalientes;

		// categorias
		Categoria[] categorias = new Categoria[3];
		Categoria comidaChina = new Categoria("Comida China", "Todo tipo de comida China", "Xun Guao", chinos);
		Categoria comidaItaliana = new Categoria("Comida Italiana", "Todo tipo de comida Italiana",
				"Antonio Margarette", italianos);
		Categoria comidaAmericana = new Categoria("Comida Americana", "Todo tipo de comida Americana", "John Smith",
				americanos);
		categorias[0] = comidaChina;
		categorias[1] = comidaItaliana;
		categorias[2] = comidaAmericana;

		System.out.println("Introduce una Categoria");

		Scanner sc = new Scanner(System.in);
		String opcionCategoria = sc.nextLine();

		for (int i = 0; i < categorias.length; i++)
		{
			if (categorias[i].getNombre().compareTo(opcionCategoria) == 0)
			{
				categorias[i].mostrarPlatos();
			}
		}

		System.out.println("Introduce un Plato");

		String opcionReceta = sc.nextLine();

		for (int i = 0; i < categorias.length; i++)
		{
			Plato[] pl = categorias[i].getPlatos();

			for (int j = 0; j < pl.length; j++)
			{
				if (pl[j].getNombre().compareTo(opcionReceta) == 0)
				{
					pl[j].mostrarRecetas();
				}
			}

		}
		sc.close();
	}

}
