class Siswa {
    public String idSiswa;
    public String username;
    public String password;
    public String kelas;

    // Method: Menampilkan identitas siswa
    public void tampilkanProfil() {
        System.out.println("Profil Siswa");
        System.out.println("ID      : " + idSiswa);
        System.out.println("Username: " + username);
        System.out.println("Kelas   : " + kelas);
    }

    // Method: Mengakses materi pembelajaran
    public void aksesMateri() {
        System.out.println(username + " telah mengakses materi pembelajaran.");
    }

    // Method: Mengerjakan quiz
    public void mengerjakanQuiz() {
        System.out.println(username + " sedang mengerjakan quiz.");
    }
}

public class TestSiswa {
    public static void main(String[] args) {
        Siswa sis = new Siswa(); 
        
        sis.idSiswa = "254311002";
        sis.username = "Indah Ayu Astuti";
        sis.password = "ayu123";
        sis.kelas = "TRPL-2A";

        sis.tampilkanProfil();  
        sis.aksesMateri();  
        sis.mengerjakanQuiz();   
    }

}
