/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pais;

import Protect.Costa_Rica;
import Protect.El_Salvador;
import Protect.Guatemala;
import Protect.Honduras;
import Protect.Nicaragua;

/**
 *
 * @author User
 */
public class Pais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Honduras HN = new Honduras();
        Guatemala GT = new Guatemala();
        Costa_Rica CR = new Costa_Rica();
        El_Salvador ES = new El_Salvador();
        Nicaragua NI = new Nicaragua();
        
        System.out.println(HN.getCountry());
        System.out.println(HN.getPresident());
        System.out.println(GT.getCountry());
        System.out.println(GT.getPresident());
        System.out.println(CR.getCountry());
        System.out.println(CR.getPresident());
        System.out.println(ES.getCountry());
        System.out.println(ES.getPresident());
        System.out.println(NI.getCountry());
        System.out.println(NI.getPresident());
        
    }
    
}
