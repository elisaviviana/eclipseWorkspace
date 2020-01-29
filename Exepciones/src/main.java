
public class main {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("a456");

		}catch (Exception e) {
			 System.out.println ("ERROR: no se pudo convertir de String a int" + e);
		}
		
		int [] array = new int[20];
		try	{
		//array[-3] = 24;
		int b = 0;
		int a = 23/b;
		}
		catch (ArrayIndexOutOfBoundsException excepcion)
		{
		System.out.println(" Error de índice en el array");
		}
		catch (ArithmeticException excepcion)
		{
		System.out.println(" Error de división por cero");
		}
		catch (Exception excepcion)
		{
		System.out.println(" Error: " + excepcion);
		}
		finally
		{
		System.out.println(" Se ejecuta siempre");
		}
		
		
		
		
	}

}
