package com.mycompany.aplikasibangundatar;

/**
 *
 * @author User
 */
abstract class BangunDatar {
    private String namaBangunDatar;
    
    public BangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    public BangunDatar(){
    
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    //KODE TERBARU
    abstract double luas();
    abstract double keliling();
    
}
