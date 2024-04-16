package clases_abstractas;

public class VegiFood extends Restaurante {

	public VegiFood(String nombre, String ubicacion) {
		super(nombre, ubicacion);
	}

	@Override
	void obtenerMenu() {
		System.out.println("crema de tomate y zapallo, guizo de arbejas y nuez, zapallo italiano rellenmo con lentejas");
	}

	@Override
	double calcularCostoPedido(int cantidad, double precioUnitario) {
		if (cantidad>5) {
			return cantidad*(precioUnitario*0.9);
		} else {
		return cantidad*precioUnitario;
		}
	}

}
