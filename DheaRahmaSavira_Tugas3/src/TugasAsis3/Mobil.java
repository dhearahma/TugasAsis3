/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis3;

/**
 *
 * @author Dhea
 */
public class Mobil extends kendaraan {
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;
    
    @Override
    public void setNamaKendaraan(String nama) {
        this.namaKendaraan = nama;
    }
    
    public String getNama() {
        return namaKendaraan;
    }
    
    @Override
    public void setTipeKendaraan(String tipe) {
        super.setTipeKendaraan(tipe);
    }
    
    public String getTipe() {
        return tipeKendaraan;
    }
    
    @Override
    public void setKapasitasMesin(int kapasitas) {
        super.setKapasitasMesin(kapasitas);
    }
    
    public int getKapsitasMesin() {
        return kapasitasMesin;
    }
    
    @Override
    public void setBahanBakar(float bb) {
        this.bahanBakar = bb;
    }
    
    @Override
    public float getBahanBakar() {
        return bahanBakar;
    }
    
    @Override
    public void infoKendaraan() {
        System.out.print("\nNama Kendaraan\t\t\t: Mobil ");
        super.infoKendaraan();
    }
}
