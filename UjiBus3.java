/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanenkapulasi4;

/**
 *
 * @author ACER
 */
public class UjiBus3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Bus3 Bus = new Bus3(5);
        Bus.getpenumpang(23);
        Bus.cetakpenumpang();

       // penambahan penumpang
       Bus.addpenumpang(2); //tambah 2 penumpang
       Bus.cetakpenumpang(); 
       // penambahan penumpang
       Bus.addpenumpang(1); //tambah 1 penumpang
       Bus.cetakpenumpang();
       // penambahan penumpang
       Bus.addpenumpang(2); //tambah 2 penumpang
       Bus.cetakpenumpang();
       // penambahan penumpang
       Bus.addpenumpang(2); //tambah 2 penumpang
       Bus.cetakpenumpang();
    }
}
