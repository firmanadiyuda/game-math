package backend;

import frontend.*;
import java.util.Scanner;

public class Pengurangan extends Soal {
    
    // Atribut.
    static int inputJawaban;
    static int jawabanBenarnya;
    public static Scanner sc = new Scanner(System.in);

    // Soal Pengurangan.
    public static void soalPengurangan(Player player){
  
        player.setNyawa(3);
        player.setSkor(0);

        // Masuk ke View Menu Penjumlahan.
        View.tampilanPengurangan();
        

        // Selama skor masih dibawah 300 dan nyawa masih diatas 0,
        // Maka perintah di dalam bracket while di bawah ini
        // akan dieksekusi terus menerus.
        while((player.getSkor() < 300) && (player.getNyawa() > 0) ) {
        
            // Set bilangan pertama dan kedua secara random sesuai skor player.
            if (player.getSkor() <= 100) {
                Pengurangan.setBil1(Pengurangan.randomNumber(0, 10));
                Pengurangan.setBil2(Pengurangan.randomNumber(0, 10));
                while (Pengurangan.getBil1() < Pengurangan.getBil2()) {
                    Pengurangan.setBil1(Pengurangan.randomNumber(0, 10));
                    Pengurangan.setBil2(Pengurangan.randomNumber(0, 10));
                }
            }

            else if ((player.getSkor() >= 101) && (player.getSkor() <= 200)) {
                Pengurangan.setBil1(Pengurangan.randomNumber(-10, -1));
                Pengurangan.setBil2(Pengurangan.randomNumber(-10, -1));
            }

            else if ((player.getSkor() >= 201) && (player.getSkor() <= 300)) {
                Pengurangan.setBil1(Pengurangan.randomNumber(-10, 10));
                Pengurangan.setBil2(Pengurangan.randomNumber(-10, 10));
            }
            
            
            // Cek apakah yang diinputkan user sudah valid?
            while (true) {
                try {
                    
                    // Print pertanyaan dengan memanggil method non-void 'tampilanPenjumlahan'
                    // kemudian mengembalikan return berupa inputan player lalu menyimpannya dalam
                    // variabel 'inputJawaban' Karna inputan awal masih berupa string. maka di convert
                    // terlebih dahulu menjadi Integer.
                    inputJawaban = Integer.parseInt(View.tampilanPengurangan(Pengurangan.getBil1(), Pengurangan.getBil2()));

                    // Hentikan pengecekan dan lanjutkan program.
                    break;
                  
                // Jika inputan yang dimasukkan player tidak valid,
                // Misal berupa String, maka...
                } catch (NumberFormatException e) {

                    // Tidak melakukan apa-apa alias kembali lagi ke pengecekan karna
                    // masih di dalam while loop.

                }
            }
            
            // Cek jawaban yang benar dan memasukkannya ke dalam variabel.
            jawabanBenarnya = Pengurangan.getBil1() - Pengurangan.getBil2();

            // Jika inputan user sama dengan jawabanBenarnya, maka...
            if (inputJawaban == jawabanBenarnya) {
                player.setSkor(player.getSkor() + 4);
                View.separator();
                Soal.setLevel(player.getSkor());
                View.jawaban("true", player);

            // Jika inputan user tidak sama dengan jawabanBenarnya, maka...
            } else {
                player.setSkor(player.getSkor() - 1);
                player.setNyawa(player.getNyawa() - 1);
                View.separator();
                Soal.setLevel(player.getSkor());
                View.jawaban("false", player);
            }
        
            
        }

        if (player.getNyawa() <= 0) {
            View.tampilanNyawaHabis(player);
            sc.nextLine();
            
            View.tampilanMenu(player);
        } else {
            View.tampilanBerhasilPengurangan(player);
            sc.nextLine();
            
            View.tampilanMenu(player);
        }

    }

  
}
