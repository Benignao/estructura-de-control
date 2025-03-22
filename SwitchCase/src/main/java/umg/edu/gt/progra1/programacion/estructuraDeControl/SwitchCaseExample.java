/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.progra1.programacion.estructuraDeControl;

/**
 *
 * @author wcord
 */
public class SwitchCaseExample {
    
    public String getDiaSemana(int dia) {
        String diaEnLetras = "";
        
        diaEnLetras = switch (dia) {
            case 1 -> "Domingo";
            case 2 -> "Lunes";
            case 3 -> "Martes";
            case 4 -> "Miercoles";
            case 5 -> "Jueves";
            case 6 -> "Viernes";
            case 7 -> "Domingo";
            default -> "Dia no valido";
        };
        return diaEnLetras;
        
    } 
    
    public boolean getDiasNoLaborales(String dia) {
        boolean esLaboral;
        
        esLaboral = switch (dia) {
            case "Sabado", "Domingo" -> false;
            case "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" -> true;
            default -> false;
        };
        return esLaboral;
        
    } 
    
    /*
    Ejercicio 1:
    El programa solicita dos números y una operación (+, -, *, / o %).
    Luego, usa switch para realizar la operación y mostrar el resultado.

    */
    
    
}
