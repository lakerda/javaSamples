/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siniflarintekrarkullanilmasi;

/**
 *
 * @author Hp
 */
class Calisan {

    public void isYap(double a){
    
        System.out.println("calisan.isYap()");
    }
}

class Mudur extends Calisan{

    public void isYap(int a){
    
        System.out.println("mudur.isYap()");
    }
}
public class SiniflarinTekrarKullanilmasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Mudur m = new Mudur();
        m.isYap(3.3);
        m.isYap(3);
    }
    
}
