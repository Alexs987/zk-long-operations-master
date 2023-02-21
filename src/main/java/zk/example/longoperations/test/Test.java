package zk.example.longoperations.test;



public class Test {
	public void hola(){
		System.out.println("Clase de ejemplo!");
	}
	
	public void mensajeBienvenida() {
		System.out.println("Bienvendido!");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.hola();
		test.mensajeBienvenida();
	}
}
