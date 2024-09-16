/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan_parfume;

/**
 *
 * @author luthfi
 */
// nomer 3
//inheritance selain extends jFrame
public class loginakun extends LOGIN{
    public static void main (String[] args){
        LOGIN newlogin = new LOGIN();
        newlogin.setVisible(true);
        
    }
    public loginakun (){
        
        super.setLocationRelativeTo(null);
        //point nomer 7
    }
    public void overiding(){//overiding
        super.setKoneksi();//super
    }
}
