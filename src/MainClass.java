import backend.*;
import frontend.View;


public class MainClass {

    // Class utama untuk menjalankan program.
    public static void main(String[] args) {

        // Buat objek player baru dan instansiasi nilai awal.
        Player player = new Player();
        
        // Masuk ke tampilan utama untuk input nama.
        // Parameter pertama 'player' untuk passing objek 'player'.
        View.tampilanUtama(player);

        // Masuk ke tampilan Menu.
        // Parameter pertama 'player' untuk passing objek 'player'.
        View.tampilanMenu(player);       

   }

}

    
