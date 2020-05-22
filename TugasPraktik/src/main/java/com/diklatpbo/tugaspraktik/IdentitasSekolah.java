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
public class IdentitasSekolah {
    protected String npsn;
    protected String status;
    protected String bentuk_pendidikan;
    protected String status_kepemilikan;
    protected String sk_pendirian_sekolah;
    protected String tgl_sk_pendirian;
    
    /**
     *
     * @param npsn
     * @param status
     * @param bentuk_pendidikan
     * @param status_kepemilikan
     * @param sk_pendirian_sekolah
     * @param tgl_sk_pendirian
     */
    public IdentitasSekolah(String npsn,String status,String bentuk_pendidikan,
            String status_kepemilikan,String sk_pendirian_sekolah,
            String tgl_sk_pendirian){
            this.npsn=npsn;
            this.status=status;
            this.bentuk_pendidikan=bentuk_pendidikan;
            this.status_kepemilikan=status_kepemilikan;
            this.sk_pendirian_sekolah=sk_pendirian_sekolah;
            this.tgl_sk_pendirian=tgl_sk_pendirian;
    }
    public void infoSekolah(){
        System.out.println("Identitas Sekolah");
    }
}
