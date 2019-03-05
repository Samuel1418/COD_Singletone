/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod_singlotone;

/**
 *
 * @author Samuel
 */
public class COD_SINGLOTONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Singletone.instancia();
         Singletone ricardo = Singletone.getSingletonInstance(150,"Pepe",8);
         System.out.println(ricardo.getCodTrabajador());
         System.out.println(ricardo.getNomConjunCaja());
         System.out.println(ricardo.getNumCajasM());
    }
    
}
