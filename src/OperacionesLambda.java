import java.util.Scanner;

interface IOperar<T>{
	public T operacion(T a, T b);
}

public class OperacionesLambda {
	static void operaciones() {
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplicacion");
		System.out.println("4.Division");
		System.out.println("5.Potencia");
		System.out.println("6.Cerrar aplicacion");
	}
	public static void main(String[] args) {
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		operaciones();

		while(opcion!=6) {
			System.out.println("");
			System.out.println("Que quieres hacer:");
			opcion = sc.nextInt();

			if(opcion==1) {
				System.out.println("Vamos a sumar:");
				System.out.println("");
				System.out.println("Primer número:");
				int num1= sc.nextInt();
				System.out.println("Segundo número:");
				int num2= sc.nextInt();
				
				IOperar <Integer> operacion= (n1,n2)-> n1+n2;
				
				System.out.println(operacion.operacion(num1, num2));
			}
			else if(opcion==2) {
				System.out.println("Vamos a restar: ");
				System.out.println("");
				System.out.println("Primer número:");
				int num1= sc.nextInt();
				System.out.println("Segundo número:");
				int num2= sc.nextInt();
				IOperar <Integer> operacion= (n1,n2)-> n1-n2;
				System.out.println(operacion.operacion(num1, num2));
			}
			else if(opcion==3) {
				System.out.println("Vamos a multiplicar: ");
				System.out.println("");
				System.out.println("Primer número:");
				int num1= sc.nextInt();
				System.out.println("Segundo número:");
				int num2= sc.nextInt();
				IOperar <Integer> operacion= (n1,n2)-> n1*n2;
				System.out.println(operacion.operacion(num1, num2));
			}
			else if(opcion==4) {
				System.out.println("Vamos a dividir: ");
				System.out.println("");
				System.out.println("Primer número:");
				int num1= sc.nextInt();
				System.out.println("Segundo número:");
				int num2= sc.nextInt();
				IOperar <Integer> operacion= (n1,n2)-> n1/n2;
				System.out.println(operacion.operacion(num1, num2));
			}

			else if(opcion==5) {
				System.out.println("Vamos a calcular la potencia:");
				System.out.println("");
				System.out.println("El número:");
				int num1= sc.nextInt();
				System.out.println("Teclee la potencia deseada:");
				int num2= sc.nextInt();
				IOperar <Integer> operacion= (n1,n2)-> {
					int potencia=n1;
					if(n2>0) {
					for(int i=0;i<n2-1;i++) {
						potencia*=n1;
					}}
					else
						potencia=1;
					return potencia;
				};
				System.out.println(operacion.operacion(num1, num2));
			}

			else if(opcion==6) {
				System.out.println("");
				System.out.println("Se acabo operar por hoy");
			}
			else {
				System.out.println("Numero invalido");
			}
		}
	}
}