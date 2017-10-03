/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

/**
 *
 * @author Roberto
 */
public class LenguajeER {
    private String concatenacion = ".";
    private String union = "|";
    private String estrella = "*";
    private String parentesisIzq = "(";
    private String parentesisDer = ")";
    private String epsilon = "_";
    private String vacio = "~";
    private String sigma[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m"
                             ,"n","o","p","q","r","s","t","u","v","w","x","y","z",
                             "A","B","C","D","E","F","G","H","I","J","K","L","M",
                             "N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                             "0","1","2","3","4","5","6","7","8","9"};
            
            
public void imprimir(){
    String prueba[]={"a",".","b","|","c"};
    for (int i = 0; i < prueba.length ; i++) {
        System.out.println(prueba[i]+",");
        System.out.println(i+",");
    }
}   
    
}
