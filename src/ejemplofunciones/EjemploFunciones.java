/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofunciones;

import java.util.Scanner;

/**
 *
 * @author morozco
 */
public class EjemploFunciones {

     public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        double valor1;
        double valor2;
        int opcion;
        double resultado = 0;
        
        System.out.println("Ingrese 2 valores a operar y la opción a realizar (1(+), 2(-), 3(*), 4(/))");
        valor1 = sc.nextDouble();
        valor2 = sc.nextDouble();
        opcion = sc.nextInt();
        switch (opcion){
            case 1:
                resultado = suma(valor1,valor2);
                break;
            case 2:
                resultado = resta(valor1,valor2);
                break;
            case 3:
                resultado = multiplicar(valor1,valor2);
                break;
            case 4:
                resultado = division(valor1,valor2);
                break;
            default:
                break;
        }
        
        System.out.println("el resultado de la operación:" + resultado);
    }
    
    public static double suma(double valor1, double valor2){
        return valor1 + valor2;
    }
    
    public static void sum(double valor1, double valor2){
        double resultado = valor1+valor2;
        System.out.println("la sumatoria es:" + resultado);
    }
    
    public static double resta(double valor1, double valor2){
        return valor1-valor2;
    }
    
    public static double multiplicar(double valor1, double valor2){
        return valor1*valor2;
    }
    
    public static double division(double valor1, double valor2){
        if(valor2 > 0){
            return valor1 / valor2;
        }
        return 0;
    }
    
}
