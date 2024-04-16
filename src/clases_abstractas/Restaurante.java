package clases_abstractas;

public abstract class Restaurante {

	public String nombre;
	public String ubicacion;
	
	public Restaurante(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	abstract void obtenerMenu();
	abstract double calcularCostoPedido(int cantidad, double precioUnitario);
	
}
