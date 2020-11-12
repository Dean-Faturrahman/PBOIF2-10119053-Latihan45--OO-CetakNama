/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan45.oo.cetaknama;

import java.util.Scanner;
import model.Printer;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program cetak nama
 */
public class PBOIF210119053Latihan45OOCetakNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.println("=====Aplikasi Pencetak Nama====");
        System.out.print("Masukkan nama anda : ");
        printer.setNama(input.nextLine());        
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(input.nextInt());
        printer.cetak(printer.getNama());        
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}
