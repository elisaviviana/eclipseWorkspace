
public class Producto {
	//Atributos
	private String nombre;
	private String descripcion;
	private Integer precioUnitario;
	private Integer cantidad;
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Integer getPrecioUnitario() {
		return precioUnitario;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public void setDescripcion(String desc) {
		this.descripcion = desc;
	}
	public void setPrecioUnitario(Integer precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	//Constructor
		public Producto(String nombre, String descripcion, Integer precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precio;
	}
	//Métodos


}
