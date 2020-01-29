package dh.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class SpringMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext();
		contexto.register(SpringConfigurador.class);
		contexto.refresh();
		Servicio miservicio = contexto.getBean(Servicio.class);
		System.out.println(miservicio.mensaje());
		
		contexto.close();
		System.out.println("Spring Context Closed");
	}
}
