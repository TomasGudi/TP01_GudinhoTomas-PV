package ar.edu.unju.fi.ejercicio09.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio09.model.Producto;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Producto producto = new Producto();
		System.out.print("\nIngrese Nombre: ");
        String nombre = scanner.nextLine();
        producto.setNombre(nombre);
        System.out.print("\nIngrese codigo: ");
        int codigo = scanner.nextInt();
        producto.setCodigo(codigo);
        System.out.print("\nIngrese precio: ");
        double precio = scanner.nextDouble();
        producto.setPrecio(precio);
        System.out.print("\nIngrese descuento entre 0 y 50: ");
        int descuento = scanner.nextInt();
        while(descuento<0 || descuento>51) {
        	System.out.print("\nIngrese descuento entre 0 y 50: ");
        	descuento = scanner.nextInt();
		}
        producto.setDescuento(descuento);
        
        scanner.close();
        
        System.out.println(producto);
        System.out.println("Precio con decuento=" + producto.calcularDescuento());
	}
}