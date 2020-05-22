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
public class DataRinci extends IdentitasSekolah{
    protected String waktu_penyelenggaraan;
    protected String sumber_listrik;
    protected String daya_listrik;
    protected String akses_internet;
    
    public DataRinci(String waktu_penyelenggaraan,String sumber_listrik,
        String daya_listrik,String akses_internet,
        String npsn1,String status1,String bentuk_pendidikan1,
        String status_kepemilikan1,String sk_pendirian_sekolah1,
        String tgl_sk_pendirian1){
        
        super(npsn1,status1,bentuk_pendidikan1,status_kepemilikan1,
                sk_pendirian_sekolah1,tgl_sk_pendirian1);
        
        this.waktu_penyelenggaraan=waktu_penyelenggaraan;
        this.sumber_listrik=sumber_listrik;
        this.daya_listrik=daya_listrik;
        this.akses_internet=akses_internet;
    }
    
    @Override
    public void infoSekolah(){
        System.out.println("Data Rinci Identitas Sekolah");
        System.out.println("----------------------------");
        System.out.println("NPSN : "+super.npsn);
        System.out.println("Status : "+super.status);
        System.out.println("Bentuk Pendidikan : "+super.bentuk_pendidikan);
        System.out.println("Status Kepemilikan : "+super.status_kepemilikan);
        System.out.println("SK Pendirian Sekolah : "+
                super.sk_pendirian_sekolah);
        System.out.println("Tanggal SK Pendirian : "+super.tgl_sk_pendirian);
        System.out.println("Waktu Penyelenggaraan : "+
                this.waktu_penyelenggaraan);
        System.out.println("Sumber Listrik : "+this.sumber_listrik);
        System.out.println("Daya Listrik : "+this.daya_listrik);
        System.out.println("Akses Internet : "+this.akses_internet);
    }
}
