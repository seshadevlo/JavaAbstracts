package clases_abstractas;

public class Pizzeria extends Restaurante {

	public Pizzeria(String nombre, String ubicacion) {
		super(nombre, ubicacion);
	}	
	
	@Override
	void obtenerMenu() {
		System.out.println("napolitana, vegetariana, 4quesos");
	}

	@Override
	double calcularCostoPedido(int cantidad, double precioUnitario) {
		
		if(cantidad > 10) {
			return 100.0;
		} else {
		return cantidad*precioUnitario;
		}
	}

}
