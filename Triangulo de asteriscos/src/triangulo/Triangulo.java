/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

import java.util.*;
public class Triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int x=0;
        System.out.println("Ingrese el numero de filas que tendra el triangulo");
        x=sc.nextInt();
        triangulo(x);
    }
	private static void triangulo(int x) {
		// TODO Auto-generated method stub
		char espacio=' ', asterisco='*';
		   for(int i=1; i<=x; i++){
	            for(int espacios=x-i; espacios>0; espacios--)
	                System.out.print(espacio);
	            for(int lineas=1; lineas<=i; lineas++)
	                System.out.print(asterisco);
	            System.out.println("");
		   }
	}
}
