/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAsis3;
import java.util.Scanner;

/**
 *
 * @author Dhea
 */
public class KendaraanMain {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Kendaraan Mobil");
        System.out.print("\nMasukkan Tipe Kendaraan\t\t: ");
        String tipe = input.next();
        System.out.print("Masukkan Kapasitas Kendaraan\t: ");
        int kapasitas = input.nextInt();
        System.out.print("Masukkan Jumlah Bahan Bakar\t: ");
        float bahanBakar = input.nextFloat();
        System.out.print("Masukkan ID Kendaraan\t\t: ");
        int id = input.nextInt();
        System.out.print("Masukkan Jarak Tempuh Awal\t: ");
        float awal = input.nextFloat();
        System.out.print("Masukkan Jarak Tempuh Akhir\t: ");
        float akhir = input.nextFloat();
        System.out.print("________________________________________");
        
        kendaraan k;
        
        Mobil m1 = new Mobil();
        m1.setTipeKendaraan(tipe);
        m1.setKapasitasMesin(kapasitas);
        m1.setBahanBakar(bahanBakar);
        m1.setIdKendaraan(id);
        m1.setJarakTempuhAwal(awal);
        m1.setJarakTempuh(akhir);
        
        k = m1;
        m1.infoKendaraan();
        System.out.print("________________________________________");
        
        System.out.print("\nKendaraan Sepeda Motor");
        System.out.print("\nMasukkan Tipe Kendaraan\t\t: ");
        String tipe1 = input.next();
        System.out.print("Masukkan Kapasitas Kendaraan\t: ");
        int kapasitas1 = input.nextInt();
        System.out.print("Masukkan Jumlah Bahan Bakar\t: ");
        float bahanBakar1 = input.nextFloat();
        System.out.print("Masukkan ID Kendaraan\t\t: ");
        int id1 = input.nextInt();
        System.out.print("Masukkan Jarak Tempuh Awal\t: ");
        float awal1 = input.nextFloat();
        System.out.print("Masukkan Jarak Tempuh Akhir\t: ");
        float akhir1 = input.nextFloat();
        System.out.print("________________________________________");
        
        SepedaMotor s1 = new SepedaMotor();
        s1.setTipeKendaraan(tipe1);
        s1.setKapasitasMesin(kapasitas1);
        s1.setBahanBakar(bahanBakar1);
        s1.setIdKendaraan(id1);
        s1.setJarakTempuhAwal(awal1);
        s1.setJarakTempuh(akhir1);
        
        k = s1;
        s1.infoKendaraan();
        
        
        
    }
    
}
