package tarea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorTareas {
	public static void main(String[] args) {
		
		ImpresorTareas tarea1 = new ImpresorTareas("Tarea1");
		ImpresorTareas tarea2 = new ImpresorTareas("Tarea2");
		ImpresorTareas tarea3 = new ImpresorTareas("Tarea3");
		
		System.out.println("Iniciando el Executor");
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//iniciar las tareas
		
		executorService.execute(tarea1);
		executorService.execute(tarea2);
		executorService.execute(tarea3);
		
		executorService.shutdown();
		
		System.out.printf("tareas iniciadas, metodo main finalizado %n%n");
	}

}
