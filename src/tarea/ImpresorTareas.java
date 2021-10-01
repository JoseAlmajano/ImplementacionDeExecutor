package tarea;

import java.security.SecureRandom;

public class ImpresorTareas implements Runnable {
	
	private static final SecureRandom generador = new SecureRandom();
	private final int sleepTime;
	private final String nombreTarea;
	
	public ImpresorTareas(String nombreTarea) {
	
		this.nombreTarea = nombreTarea;
		
		sleepTime = generador.nextInt(5000);
	}
	@Override 
	public void run() {
		try {
			System.out.printf("%s se fue a dormir %d milisegundos", this.nombreTarea, sleepTime);
			Thread.sleep(sleepTime);
		}catch(InterruptedException excepcion) {
			excepcion.printStackTrace();
			Thread.currentThread().interrupt();
		}
		
		
	}

}
