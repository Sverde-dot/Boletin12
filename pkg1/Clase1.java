/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin12.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author sverdecadilla
 */
public class Clase1 {

    private int plazas = 0;
    private int precio = 5;
    private int garage;
    private int matricula;
    Scanner sc = new Scanner(System.in);

    public void Paso() {

    do{
        System.out.println("1 o 2");
        int garage = sc.nextInt();
        switch(garage){
            case 1:
               entrada();

            break;
            case 2:
               salida();
               tempo();

            break;
            
        }
    }while(plazas != 5);
       System.out.println("Garage Lleno");
    }
    
    public void entrada() {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Introduce la matricula de tu coche"));
        plazas++;
    }
    public void salida(){
        System.out.println(matricula);
        int salida = Integer.parseInt(JOptionPane.showInputDialog("El coche a eliminar es"));
        this.matricula=salida;
        plazas--;
    }

    public void tempo() {
        System.out.println("Cuantas horas pasaste en el garage");
        int horas = sc.nextInt();
        if (horas < 3) {
            System.out.println("El precio es" + (precio / 1.5 * 100));
        } else {
            System.out.println("El precio es" + ((horas - 3 * (1.5)) * (precio / 0.2 * 100)));
        }
    }
}
