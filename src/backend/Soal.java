package backend;


// Pada class ini, diterapkan teknik ENCAPSULATION.
// Atribut di dalam nya bersifat private.
// Untuk mengaksesnya digunakan method setter dan getter.
public class Soal {
    
    // Atribut class Soal.
    private static int bil1;
    private static int bil2;
    public static int level;

    // Method untuk memanggil program penjumlahan.
    public static void penjumlahan(Player player) {
        Penjumlahan.soalPenjumlahan(player);
    }

    // Method untuk memanggil program pengurangan.
    public static void pengurangan(Player player) {
        Pengurangan.soalPengurangan(player);
    }




    // Method random number generator.
    public static int randomNumber(int min, int max) {

        if (min >= max) {
			throw new IllegalArgumentException("Max harus lebih besar dari Min");
		}

		return (int)(Math.random() * ((max - min) + 1)) + min;

    }
    


    // -------------------------------------
    //     Method Setter dan Getter   \/
    // -------------------------------------

    public static int getBil1() {
        return bil1;
    }

    public static void setBil1(int inBil1) {
        bil1 = inBil1;
    }

    public static int getBil2() {
        return bil2;
    }

    public static void setBil2(int inBil2) {
        bil2 = inBil2;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int skor) {
        if (skor <= 100) {
            level = 1;
        }
        
        else if ((skor >= 101) && (skor <= 200)) {
            Soal.level = 2;
        }

        else if ((skor >= 201) && (skor <= 300)) {
            Soal.level = 3;
        }
    }

    // Ini nantinya akan di OVERRIDE di masing-masing Class game (Penjumlahan atau Pengurangan)
    public static void endGame(Player player) {

    }
    
}

