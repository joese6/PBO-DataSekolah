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
public class DataPelengkap extends IdentitasSekolah{
    protected String kebutuhan_khusus_dilayani;
    protected int luas_tanah_milik;
    protected int luas_tanah_bukan_milik;
    
    public DataPelengkap(String kebutuhan_khusus_dilayani,int luas_tanah_milik,
        int luas_tanah_bukan_milik,String npsn1,String status1,
        String bentuk_pendidikan1,String status_kepemilikan1,
        String sk_pendirian_sekolah1,String tgl_sk_pendirian1){
        
        super(npsn1,status1,bentuk_pendidikan1,status_kepemilikan1,
                sk_pendirian_sekolah1,tgl_sk_pendirian1);
        
        this.kebutuhan_khusus_dilayani=kebutuhan_khusus_dilayani;
        this.luas_tanah_milik=luas_tanah_milik;
        this.luas_tanah_bukan_milik=luas_tanah_bukan_milik;
    }
    @Override
    public void infoSekolah(){
        System.out.println("Data Pelengkap Identitas Sekolah");
        System.out.println("----------------------------");
        System.out.println("NPSN : "+super.npsn);
        System.out.println("Status : "+super.status);
        System.out.println("Bentuk Pendidikan : "+super.bentuk_pendidikan);
        System.out.println("Status Kepemilikan : "+super.status_kepemilikan);
        System.out.println("SK Pendirian Sekolah : "+
                super.sk_pendirian_sekolah);
        System.out.println("Tanggal SK Pendirian : "+super.tgl_sk_pendirian);
        System.out.println("Kebutuhan Khusus Dilayani : "+
                this.kebutuhan_khusus_dilayani);
        System.out.println("Luas Tanah Milik : "+this.luas_tanah_milik);
        System.out.println("Luas Tanah Bukan Milik : "+
                this.luas_tanah_bukan_milik);
        
    }
}
