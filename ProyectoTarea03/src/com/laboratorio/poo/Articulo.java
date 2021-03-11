package com.laboratorio.poo;

public class Articulo {
	int id;
	String nombre;
	float precio;
	String marca;
	float stock;
	
	public Articulo(int id, String nombre, float precio,String marca,float stock) {
		super();
		this.id = id;
		this.nombre=nombre;
		this.precio=precio;
		this.marca=marca;
		this.stock=stock;
	}
	
	public Articulo () {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id= id;
	}
	
	public String getNombre(String nombre) {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio= precio;
	}
	public String getMarca(String marca) {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca= marca;
	}
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock= stock;
	}
	
	@Override
	public String toString() {
         return "Artículo  [id=" +id+", nombre=" +nombre+", precio=" + precio+", marca="+marca+",stock="+stock+"]";
         		}
}
