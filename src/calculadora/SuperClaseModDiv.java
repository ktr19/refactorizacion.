/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author Vespertino
 */
public class SuperClaseModDiv {
    
    public static int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero");
        }
        return dividendo / divisor;
    }

    public static int modulo(int operador1, int operador2) {
        if (operador2 == 0) {
            throw new ArithmeticException("Módulo por cero");
        }
        return operador1 % operador2;
    }
    
}
