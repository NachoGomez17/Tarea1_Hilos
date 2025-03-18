package carrera;

class Robot extends Thread {
	private String nombre;
	private boolean carreraTerminada = false;
	private int distanciaRecorrida = 0;
	private long tiempoEjecucion;

	public Robot(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public long getTiempoEjecucion() {
        return tiempoEjecucion; // Devuelve el tiempo de ejecución
    }

	@Override
	public void run() {
		int avance = (int) (Math.random() * 100);
		int distanciaTotal = (int) (Math.random() * 1000);
		long inicio = System.nanoTime(); //Devuelve el tiempo de inicio

		while (!carreraTerminada) {
			distanciaRecorrida += avance;
			if (distanciaRecorrida >= distanciaTotal) {
				carreraTerminada = true;
				long fin = System.nanoTime(); //Devuelve el tiempo cuando se ha llegado a la meta
		        tiempoEjecucion = fin - inicio; // Calcula el tiempo de ejecución
			}
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class Carrera {

	public static void main(String[] args) {

		Robot robot1 = new Robot("Robot 1");
		Robot robot2 = new Robot("Robot 2");
		robot1.start();
		robot2.start();
		
		try {
			robot1.join();
			robot2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (robot1.getTiempoEjecucion() < robot2.getTiempoEjecucion()) {
			System.out.println("El " + robot1.getNombre() + " ha ganado la carrera");
		} else {
			System.out.println("El " + robot2.getNombre() + " ha ganado la carrera");
		}
		
	}

}

//Enlace a conversación a ChatGPT
//https://chatgpt.com/share/67d9db4a-af14-8010-8707-b55cf6ca2023
