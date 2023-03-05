/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg4;
import java.util.Scanner;


/**
 *
 * @author Jeffrey Santiago Navarro Espinosa
 */
public class EJERCICIO4 {

    public static void main(String[] args) {
        // 
        int edJuan,edAlberto,edAna,edMama;
        System.out.println("Ingrese edad de Juan: ");
        Scanner entrada = new Scanner(System.in);
        edJuan = entrada.nextInt();
        edAlberto=edJuan*2/3;
        edAna=edJuan*4/3;
        edMama=edJuan+edAlberto+edAna;
        System.out.println("La edad de juan es: "+edJuan);
        System.out.println("La edad de Alberto es: "+edAlberto);
        System.out.println("La edad de Ana es: "+edAna);
        System.out.println("La edad de la mama de ellos es: "+edMama);
        
                
                
        
        

    }
    
}
