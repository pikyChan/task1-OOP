public class Siswa {
    public String idSiswa;
    public String username;
    public String password;
    public String kelas;
    public static void main(String[] args) {
        
        Siswa sis = new Siswa(); 
        sis.idSiswa = "254311002";
        sis.username = "Indah Ayu Astuti";
        sis.password = "ayu123";
        sis.kelas = "TRPL-2A";

        System.out.println("ID Siswa : " + sis.idSiswa);
        System.out.println("Username : " + sis.username);
        System.out.println("Password : " + sis.password);
        System.out.println("Kelas    : " + sis.kelas);
    }
}