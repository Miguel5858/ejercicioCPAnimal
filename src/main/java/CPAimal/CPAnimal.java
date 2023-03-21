/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CPAimal;

/**
 *
 * @author I N T R I A G O 
 */
public class CPAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Gato gato=new Gato();
         hazleHablar(gato);
         
         Perro perro=new Perro();
         hazleHablar(perro);
         
         
 }

  static void hazleHablar(CHAnimal sujeto){
    sujeto.habla();
  }

    private static void hazleHablar(Perro perro) {
             perro.habla();
    }

    private static void hazleHablar(Gato gato) {
        gato.habla();
    }
    
}  
    

