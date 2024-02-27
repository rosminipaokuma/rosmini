import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data user admin
        String adminUsername = "admin";
        String adminPassword = "onepiece";

        // Data user mahasiswa
        String[] mahasiswaUsername = {"mahasiswa1", "mahasiswa2"};
        String[] mahasiswaPassword = {"202310370311246", "202310370311244"};

        // Login menu
        System.out.println("===Library system===");
        System.out.println("Silakan pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("3. keluar");
        System.out.print("Pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline setelah nextInt()

        if (pilihan == 1) {
            // Login admin
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            if (username.equals(adminUsername) && password.equals(adminPassword)) {
                System.out.println("Login berhasil sebagai admin");
                // Kode untuk akses fitur admin
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login mahasiswa
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            boolean loginSuccess = false;
            for (int i = 0; i < mahasiswaUsername.length; i++) {
                if (username.equals(mahasiswaUsername[i]) && password.equals(mahasiswaPassword[i])) {
                    loginSuccess = true;
                    break;
                }
            }

            if (loginSuccess) {
                System.out.println("Login berhasil sebagai mahasiswa");
                // Kode untuk akses fitur mahasiswa
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }
        } else {

            System.out.println("login selesai");
        }

        scanner.close();
    }
}


