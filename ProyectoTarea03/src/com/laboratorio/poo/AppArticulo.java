package com.laboratorio.poo;

public class AppArticulo {
   public static void main(String[] args) {
   Articulo art1=new Articulo();
   art1.id=1;
   art1.nombre="Cepillo";
   art1.precio=4.5f;
   art1.marca="Colgate";
   art1.stock=4;
   
   
   System.out.println(art1.toString());
   Articulo art2=new Articulo(2,"Colgate",5,"mari",6);
   System.out.println(art2.toString());
	}
}
