package frontend;

import backend.*;
import java.text.DecimalFormat;
import java.util.Scanner;


public class View {
    
    public static Scanner sc = new Scanner(System.in);


    // View untuk tampilan utama (Input nama player).
    public static void tampilanUtama(Player player) {

        separator(); // Pemberi jarak.

        System.out.println("*********************");
        System.out.println("+-+-+ Game Math +-+-+");
        System.out.println("*********************");
        System.out.print("Masukkan Nama Anda : ");

        // Input nama player dan memasukkannya ke dalam variabel in.
        String in = sc.nextLine();

        // Pengecekan kondisi apakah inputan player kosong atau tidak.
        if ((in.isEmpty() == true) || (in == " ")) {
            player.setNama("Anonim");
        } else {
            player.setNama(in);
        }

        separator(); // Pemberi jarak.
    }
    

    // View untuk tampilan Menu.
    public static void tampilanMenu(Player player){

        separator(); // Pemberi jarak.

        System.out.println("*********************");
        System.out.println("+-+-+ Game Math +-+-+");
        System.out.println("*********************");
        System.out.println("");
        System.out.println("Menu :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Keluar");
        System.out.println("");
        System.out.print("Pilih no menu : ");

        // Ambil inputan player, kemudian mengecek inputan player.
        switch (sc.nextLine()) {
            
            case "1":
                // Panggil method penjumlahan pada Class Soal.
                Soal.penjumlahan(player);
                break;

            case "2":
                // Panggil method pengurangan pada Class Soal.
                Soal.pengurangan(player);
                break;
                
            case "3":
                separator(); // Pemberi jarak.
                separatorLine(); // Pemberi jarak dengan garis.
                System.out.println("Kamu telah keluar dari Game Math");
                separatorLine(); // Pemberi jarak dengan garis.
                break;

            default:
                // Perlihatkan View tampilanMenu lagi.
                tampilanMenu(player);
                break;
        }
        separator(); // Pemberi jarak.

    }


    // View header tampilan penjumlahan.
    public static void tampilanPenjumlahan() {
        separator(); // Pemberi jarak.

        System.out.println("************************");
        System.out.println("Game Math - Penjumlahan");
        System.out.println("************************");
        
        separator(); // Pemberi jarak.
    }

    // View konten tampilan penjumlahan dengan teknik OVERLOADING.
    public static String tampilanPenjumlahan(int bil1, int bil2) {
        
        // Formatting supaya angka negatif keluar dengan bracket.
        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " + " + dFormat.format(bil2) + " ?");
        System.out.print("Jawab : ");

        // Ambil input player dan mengembalikan nilainya.
        String input = sc.nextLine();
        return input;
    }




    // View header tampilan pengurangan.
    public static void tampilanPengurangan() {
        separator(); // Pemberi jarak.

        System.out.println("************************");
        System.out.println("Game Math - Pengurangan");
        System.out.println("************************");
        
        separator(); // Pemberi jarak.
    }

    // View konten tampilan pengurangan dengan teknik OVERLOADING.
    public static String tampilanPengurangan(int bil1, int bil2) {

        // Formatting supaya angka negatif keluar dengan bracket.
        DecimalFormat dFormat = new DecimalFormat();
        dFormat.setNegativePrefix("(-");
        dFormat.setNegativeSuffix(")");

        System.out.println("Berapakah hasil dari " + dFormat.format(bil1) + " - " + dFormat.format(bil2) + " ?");
        System.out.print("Jawab : ");

        // Ambil input player dan mengembalikan nilainya.
        String input = sc.nextLine();
        return input;    }
    
    
    
    // Method pemberi jarak dengan garis.
    public static void separatorLine() {
        System.out.println("-----------------------------");
    }
    
    // Method pemberi jarak.
    public static void separator() {
        System.out.println("");
    }


    // Method View untuk menampilkan jawaban benar atau salah.
    public static void jawaban(String jawab, Player player) {

        switch(jawab){
            
            case "true":
                System.out.println("[Selamat " + player.getNama() + ", Kamu BENAR :) ] [Skor: " + player.getSkor() + "] [Nyawa: " + player.getNyawa() + "] [Level: " + Soal.getLevel() + "]");
                break;
            
            case "false":
                System.out.println("[Aduh, jawabannya SALAH :( ] [Skor: " + player.getSkor() + "] [Nyawa: " + player.getNyawa() + "] [Level: " + Soal.getLevel() + "]");
                break;
            }

        separator(); // pemberi jarak.
        separatorLine(); // pemberi jarak dengan garis.
        separator(); // pemberi jarak.
    }

    // Method View tampilan ketika nyawa sudah habis.
    public static void tampilanNyawaHabis(Player player) {
        System.out.println("[Hai " + player.getNama() + ", Nyawa kamu udah habis nih :( . Jangan menyerah ya untuk mencoba lagi :) ]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator(); // Pemberi jarak.
        separatorLine(); // Pemberi jarak dengan garis.
    }
    
    // Method View tampilan ketika berhasil menyelesaikan soal penjumlahan sampai selesai.
    public static void tampilanBerhasilPenjumlahan(Player player) {
        System.out.println("[Selamat " + player.getNama() + ", Kamu telah menyelesaikan soal penjumlahan dengan baik. Silakan dicoba soal pengurangannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator();// Pemberi jarak.
        separatorLine(); // Pemberi jarak dengan garis.
    }

    // Method View tampilan ketika berhasil menyelesaikan soal pengurangan sampai selesai.
    public static void tampilanBerhasilPengurangan(Player player) {
        System.out.println("[Selamat " + player.getNama() + ", Kamu telah menyelesaikan soal pengurangan dengan baik. Silakan dicoba soal penjumlahannya ya]");
        System.out.println("Tekan ENTER untuk kembali ke Menu.");
        separator(); // Pemberi jarak.
        separatorLine(); // Pemberi jarak dengan garis.
    }

}
