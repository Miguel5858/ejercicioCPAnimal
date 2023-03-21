/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CPAimal;

/**
 *
 * @author I N T R I A G O
 */
public abstract class CHAnimal {
    public abstract void habla();
}

class Perro extends CPAnimal{
    public void habla(){
        System.out.println("¡Guau!");
    }
}

class Gato extends CPAnimal{
    public void habla(){
        System.out.println("¡Miau!");
    }
}