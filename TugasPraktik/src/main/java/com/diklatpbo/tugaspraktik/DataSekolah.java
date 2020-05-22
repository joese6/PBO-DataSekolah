/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diklatpbo.tugaspraktik;

/**
 *
 * @author Mas Johan
 */
public class DataSekolah {
    public static void main(String[]args){
        IdentitasSekolah is=null;
        DataPelengkap dp=new DataPelengkap("Tidak",3,0,"20539751","Negeri",
        "SMK","Pemerintah Daerah","2147483647","25 November 2005");
        DataRinci dr=new DataRinci("Sehari penuh (5 h/m)","PLN","6600",
        "Telkom Astinet","20539751","Negeri","SMK","Pemerintah Daerah",
        "2147483647","25 November 2005");
        is=dp;
        is.infoSekolah();
        System.out.println("==================================");
        is=dr;
        is.infoSekolah();
    }
}
