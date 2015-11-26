/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 * L'uso al fitxer Inici.java en diferents punts al inicialitzar els components
 * tant de clients proveidors com articles
 * @author albert
 */
public class ThrowPersonal extends Exception{
    public ThrowPersonal(String message)  {
        super(message);
        System.exit(-1);
    }
}
