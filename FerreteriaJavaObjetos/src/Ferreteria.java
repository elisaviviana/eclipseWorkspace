import java.util.ArrayList;

public class Ferreteria {
	//Atributos
	ArrayList<Producto> productos = new ArrayList<>();
	//setters and getters
	public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProducto(Producto p) {
		this.productos.add(p);
	}
	//constructor
	public void Ferreteria() {
		
	}
	//metodos
	public Integer CalcularIngresoMensual() {
		//Una ferretería industrial vendió, en promedio, durante los tres últimos meses
		//1) calcule el ingreso mensual de la ferretería por la venta de dichos bienes 
		//si el precio unitario de dichos bienes es 1500$; 40$; 180$ y 600$, 
		//respectivamente
		
		Integer precioXcantidad = 0;
		Integer ingresoM = 0;
		for(Producto p: productos) {
			precioXcantidad = p.getPrecioUnitario() * p.getCantidad();
			ingresoM = ingresoM + precioXcantidad;
//			System.out.println("el producto es "+ p.getNombre());
		}
		return ingresoM;
	}
	public void CalcularPorcentaje (Integer porcentaje) {
	//2) Calcule el ingreso para ventas que alcance el 80, 90, 100, 110 y 120% 
	//de las ventas señaladas
		System.out.println("Porcentaje "+ porcentaje+ " de "+ CalcularIngresoMensual()* porcentaje /100 );
	}
	public void CalcularStock (Integer dias) {
		//3) indique, para cada uno de dichas hipótesis de ventas, 
		//el stock de productos necesarios para cubrir ventas para 30, 45 y 60 días
		
		//for each en java
		for(Producto p: productos) {
			System.out.println("Para dentro de " + dias+ " dias son necesario "+ (dias *( p.getCantidad()/30 ))+ " de "+ p.getNombre());

		}
	}
	
	
}
