/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package saldo.ti_22205046_latihan28;
import java.util.Scanner;
/**
 *
 * @author HP
 */
/**
 * Nama : Andy Widianto
 * nim  : 22205046
 * prody: TEKNIK INFORMATIKA
 * @author HP
 */
public class TI_22205046_latihan28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Program Mengganti Kata===========");
        System.out.println("Masukan Kalimat :");
        String input = sc.nextLine();
        
        System.out.println("Ganti Kata :");
        String ganti = sc.next();
        
        System.out.println("Kata Baru  :");
        String katabaru = sc.next();
        
        String kalimatbaru = input.replace(ganti, katabaru);
        System.out.println("============Hasil Formatting=================");
        System.out.println("Kalimat awal :" +input.toLowerCase());
        System.out.println("Kalmat baru :"+kalimatbaru);
    }
}
