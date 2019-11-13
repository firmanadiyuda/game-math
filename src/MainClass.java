
import backend.*;
import frontend.View;
import java.util.Scanner;

public class MainClass {

    // Main class.
    public static void main(String[] args) {

        // Buat objek baru dan instansiasi nilai awal.
        Player player = new Player();
        

        // Masuk ke tampilan utama untuk input nama.
        // Parameter pertama 'player' untuk passing objek 'player'.
        View.tampilanUtama(player);


        // Masuk ke menu Utama.
        // Masuk ke tampilan Menu.
        View.tampilanMenu(player);
       


   }

}

    
